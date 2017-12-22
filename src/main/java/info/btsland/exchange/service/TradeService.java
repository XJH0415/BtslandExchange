package info.btsland.exchange.service;

import info.btsland.exchange.exception.NoteException;
import info.btsland.exchange.model.Note;
import info.btsland.exchange.model.User;
import info.btsland.exchange.utils.NoteNoCode;
import info.btsland.exchange.utils.NoteStatCode;
import info.btsland.exchange.utils.RemarkcodeUitil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2017/12/11.
 */
@Service
public class TradeService {
    @Autowired
    UserService userService;
    @Autowired
    NoteService noteService;
    @Autowired
    UserRecordService userRecordService;

    /**
     * 创建订单
     * @param account 用户
     * @param coin 需要承兑的货币
     * @param dealerId 用户所选择的承兑商
     * @return
     * @throws NoteException
     */
    public Note createNote(String account, String coin, String dealerId) throws NoteException {
        if(coin==null||coin.equals("")){
            throw new NoteException("coin is null ");
        }
        if(dealerId==null||dealerId.equals("")){
            throw new NoteException("dealer is null ");
        }
        if(account==null||account.equals("")){
            throw new NoteException("account.accountId is null ");
        }
        Note note=null;
        User user=userService.queryUserByDealerId(dealerId);
        if(user!=null){
            note =new Note();
            note.setDealerId(dealerId);//设置兑商
            note.setAccount(account);//设置用户
            note.setAssetCoin(coin);//设置货币名称
            note.setBrokerage(user.getBrokerageIn());//设置手续费
            note.setBrokerage(user.getBrokerageOut());//设置手续费
            note.setRemarkCode(RemarkcodeUitil.createCode());//设置充值码
            note.setStatNo(NoteStatCode.ACCOUNT_FILLING);//设置状态
            note.setFlowPath(""+NoteStatCode.ACCOUNT_FILLING);
        }
        return note;
    }

    /**
     * 保存数据
     * @param account
     * @param note
     * @return -1 表示用户不存在，-2 表示订单的用户名和用户的用户名不一致
     */
    public int saveNote(String account,Note note) throws NoteException {
        if(account==null||account.equals("")){
            throw new NoteException("account is null");
        }
        if(note==null){
            throw new NoteException("note is null");
        }
        User user1 = userService.loginAccount(account);
        if(user1!=null){
            if( note.getAccount().equals(user1.getAccount())){
                return saveNote(note);
            }else {
                return -2;
            }
        }else {
            return -1;
        }
    }

    /**
     * 保存订单
     * @param note
     * @return
     */
    private int saveNote(Note note) throws NoteException {
        if(note==null){
            throw new NoteException("note is null");
        }
        note.setNoteNo(NoteNoCode.createNoteNoCode());//设置流水号
        return noteService.saveOrUpdate(note);
    }

    /**
     * 更新状态
     * @param noteNo
     * @param stat
     * @return
     * @throws NoteException
     */
    public int updateNoteStat(String noteNo,int stat) throws NoteException {
        if(noteNo==null||noteNo.equals("")){
            throw new NoteException("noteNo is null");
        }
        Note note=noteService.queryNote(noteNo);
        if(note==null){
            return 0;
        }
        note.setStatNo(stat);//更新状态
        note.setFlowPath(note.getFlowPath()+"-"+stat);//更新流程码
        //更新时间戳
        switch (stat){
            case NoteStatCode.ACCOUNT_TRANSFERRING:
                note.setStartTime(new Date());//开始时间戳
                break;
            case NoteStatCode.ACCOUNT_CONFIRMED:
                note.setAccountReTime(new Date());//用户确认时间戳
            break;
            case NoteStatCode.HELP_CONFIRMED:
                note.setEndTime(new Date());//结束时间戳
                userRecordService.reckonLevel(note.getDealerId(),noteNo);//计算积分
                break;
            case NoteStatCode.HELP_CONFIRMING:
                note.setDealerReTime(new Date());//承兑商确认时间戳
                break;
            case NoteStatCode.ADMIN_CONFIRMED:
                note.setEndTime(new Date());//结束时间戳
                userRecordService.reckonLevel(note.getDealerId(),noteNo);//计算积分
                break;
            case NoteStatCode.ADMIN_TRANSFERRING:
                note.setDealerReTime(new Date());//承兑商确认时间戳
                break;
        }
        return noteService.saveOrUpdate(note);
    }

    public int queryNoteCount(String dealerId) throws NoteException {
        if(dealerId==null||dealerId.equals("")){
            throw new NoteException("dealerId is null ");
        }
        return noteService.queryNoteCount(dealerId);
    }
}
