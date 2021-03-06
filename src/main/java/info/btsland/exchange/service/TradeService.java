package info.btsland.exchange.service;

import info.btsland.exchange.exception.NoteException;
import info.btsland.exchange.model.Note;
import info.btsland.exchange.model.User;
import info.btsland.exchange.utils.NoteNoCode;
import info.btsland.exchange.utils.NoteStatCode;
import info.btsland.exchange.utils.RemarkcodeUitil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
            if(coin.equals("CNY")){
                note.setBrokerage(user.getBrokerageIn());//设置手续费
            }else if(coin.equals("RMB")){
                note.setBrokerage(user.getBrokerageOut());//设置手续费
            }
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
     * @return
     */
    public String saveNote(String account,Note note) throws NoteException {
        if(account==null||account.equals("")){
            throw new NoteException("account is null");
        }
        if(note==null){
            throw new NoteException("note is null");
        }
        User user1 = userService.loginAccount(account);
        User dealer = userService.queryUserByDealerId(note.getDealerId());
        if(dealer==null){
            return "";
        }
        if(note.getAssetCoin().equals("RMB")) {
            if(note.getAssetNum()>dealer.getUpperLimitOut()){
                return "";
            }
        }
        if(user1!=null){
            if( note.getAccount().equals(user1.getAccount())){
                return saveNote(note);
            }else {
                return "";
            }
        }else {
            return "";
        }
    }

    /**
     * 保存订单
     * @param note
     * @return
     */
    private String saveNote(Note note) throws NoteException {
        if(note==null){
            throw new NoteException("note is null");
        }

        String noteNo=NoteNoCode.createNoteNoCode();
        note.setNoteNo(noteNo);//设置流水号
        int a =noteService.saveOrUpdate(note);
        if(a>0){
            return noteNo;
        }else {
            return "";
        }
    }
    public int updateNoteReal(@RequestParam("noteNo")String noteNo, @RequestParam("realNo")String realNo, @RequestParam("realType")String realType, @RequestParam("realDepict")String realDepict){

        int a=0;
        Note note=noteService.queryNote(noteNo);
        note.setRealNo(realNo);
        note.setRealType(realType);
        note.setRealDepict(realDepict);
        a = noteService.saveOrUpdate(note);
        return a;
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

    public int updateNoteDepict(String noteNo, String depict) {
        Note note=noteService.queryNote(noteNo);
        if(note==null){
            return 0;
        }
        note.setDepict(depict);
        return noteService.saveOrUpdate(note);
    }
}
