package info.btsland.exchange.service.impl;

import info.btsland.exchange.mapper.UserRecordMapper;
import info.btsland.exchange.model.Note;
import info.btsland.exchange.model.UserInfo;
import info.btsland.exchange.model.UserRecord;
import info.btsland.exchange.model.UserRecordExample;
import info.btsland.exchange.service.NoteService;
import info.btsland.exchange.service.UserInfoService;
import info.btsland.exchange.service.UserRecordService;
import info.btsland.exchange.utils.NoteStatCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/14.
 */
@Service
public class UserRecordServiceImpl implements UserRecordService {
    @Autowired
    UserRecordMapper userRecordMapper;
    @Autowired
    NoteService noteService;
    @Autowired
    UserInfoService userInfoService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public int reckonNoteInClinchCount(String dealerId) {
        return  noteService.queryAllClinchNote(dealerId,"CNY").size();
    }

    @Override
    public int reckonNoteInHavingCount(String dealerId) {
        return noteService.queryAllHavingNote(dealerId,"CNY").size();
    }

    @Override
    public double reckonNoteInClinchTotal(String dealerId) {
        List<Note> notes=noteService.queryAllClinchNote(dealerId,"CNY");
        Double total=0.0;
        for(int i=0;i<notes.size();i++){
            Note note=notes.get(i);
            total+=note.getAssetNum();
        }
        return total;
    }
    @Override
    public double reckonNoteInHavingTotal(String dealerId) {
        List<Note> notes=noteService.queryAllHavingNote(dealerId,"CNY");
        Double total=0.0;
        for(int i=0;i<notes.size();i++){
            Note note=notes.get(i);
            total+=note.getAssetNum();
        }
        return total;
    }

    @Override
    public int reckonNoteOutClinchCount(String dealerId) {
        return  noteService.queryAllClinchNote(dealerId,"RMB").size();
    }

    @Override
    public int reckonNoteOutHavingCount(String dealerId) {
        return  noteService.queryAllHavingNote(dealerId,"RMB").size();
    }

    @Override
    public double reckonNoteOutClinchTotal(String dealerId) {
        List<Note> notes=noteService.queryAllClinchNote(dealerId,"RMB");
        Double total=0.0;
        for(int i=0;i<notes.size();i++){
            Note note=notes.get(i);
            total+=note.getAssetNum();
        }
        return total;
    }

    @Override
    public double reckonNoteOutHavingTotal(String dealerId) {
        List<Note> notes=noteService.queryAllHavingNote(dealerId,"RMB");
        Double total=0.0;
        for(int i=0;i<notes.size();i++){
            Note note=notes.get(i);
            total+=note.getAssetNum();
        }
        return total;
    }

    @Override
    public double reckonNoteTime(String dealerId) {
        List<Note> notes=noteService.queryAllClinchNote(dealerId);
        double time=-1;
        double allTime=0;
        double size=notes.size();
        for(int i=0;i<notes.size();i++){
            Note note=notes.get(i);
            allTime+=note.getEndTime().getTime()-note.getAccountReTime().getTime();
        }
        if(size!=0){
            time=allTime/size/1000/60;
        }
        return time;
    }

    @Override
    public int saveOrUpdate(String dealerId) {
        int inClinchCount=reckonNoteInClinchCount(dealerId);
        double inClinchTotal=reckonNoteInClinchTotal(dealerId);
        int inHavingCount=reckonNoteInHavingCount(dealerId);
        double inHavingTotal=reckonNoteInHavingTotal(dealerId);

        int outClinchCount=reckonNoteOutClinchCount(dealerId);
        double outClinchTotal=reckonNoteOutClinchTotal(dealerId);
        int outHavingCount=reckonNoteOutHavingCount(dealerId);
        double outHavingTotal=reckonNoteOutHavingTotal(dealerId);
        double time=reckonNoteTime(dealerId);

        UserRecord newUserRecord=new UserRecord();
        newUserRecord.setDealerId(dealerId);//设置承兑商
        newUserRecord.setInClinchCount(inClinchCount);//设置充值完成单数
        newUserRecord.setInClinchTotal(inClinchTotal);//设置提现完成总额
        newUserRecord.setInHavingTotal(inHavingTotal);//设置正在充值总额
        newUserRecord.setInHavingCount(inHavingCount);//设置正在充值单数
        newUserRecord.setOutClinchTotal(outClinchTotal);//设置提现完成总额
        newUserRecord.setOutClinchCount(outClinchCount);//设置提现完成单数
        newUserRecord.setOutHavingCount(outHavingCount);//设置正在提现单数
        newUserRecord.setOutHavingTotal(outHavingTotal);//设置正在提现总额
        newUserRecord.setTime(time);//设置平均时间
        UserRecordExample recordExample=new UserRecordExample();
        recordExample.createCriteria().andDealerIdEqualTo(dealerId);
        UserRecord oldUserRecord = userRecordMapper.selectByDealerId(dealerId);
        if (oldUserRecord==null){
            return userRecordMapper.insert(newUserRecord);
        }else {
            newUserRecord.setId(oldUserRecord.getId());
            return userRecordMapper.updateByExample(newUserRecord,recordExample);
        }
    }

    @Override
    public UserRecord queryUserRecord(String dealerId) {
        return userRecordMapper.selectByDealerId(dealerId);
    }

    @Override
    public int reckonLevel(String dealerId,String noteNo) {
        Note note=noteService.queryNote(noteNo);
        Double level=0.0;
        UserInfo userInfo = userInfoService.queryUserInfo(dealerId);
        if(note!=null){
            if(note.getStatNo()== NoteStatCode.TIMEOUT){
                level=-5.0;
            }else if(note.getStatNo()==NoteStatCode.ADMIN_CONFIRMED){
                level=0.0;
            }else {
                double oldlv=userInfo.getLevel();
                int lv= (int) (oldlv/20+1);
                double num=note.getAssetNum();
                level = num/10000*getScale(lv)+(1*getScale(lv));//计算得分（万数*得分比例+单数*得分比例）
            }
        }
        return userInfoService.updateUserInfo(userInfo,level);
    }

    private double getScale(int lv){
        double scale=0.0;
        switch (lv){
            case 1:
                scale=1;
                break;
            case 2:
                scale=1;
                break;
            case 3:
                scale=0.5;
                break;
            case 4:
                scale=0.1;
                break;
            case 5:
                scale=0.01;
                break;
        }
        return scale;
    }
}
