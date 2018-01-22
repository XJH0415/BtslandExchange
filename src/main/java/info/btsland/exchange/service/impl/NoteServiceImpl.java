package info.btsland.exchange.service.impl;

import info.btsland.exchange.mapper.NoteMapper;
import info.btsland.exchange.model.Note;
import info.btsland.exchange.model.NoteExample;
import info.btsland.exchange.model.User;
import info.btsland.exchange.model.UserInfo;
import info.btsland.exchange.service.NoteService;
import info.btsland.exchange.service.UserInfoService;
import info.btsland.exchange.service.UserService;
import info.btsland.exchange.utils.NoteNoCode;
import info.btsland.exchange.utils.NoteStatCode;
import info.btsland.exchange.utils.UserStatCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/12/13.
 */
@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    NoteMapper noteMapper;
    @Autowired
    UserInfoService userInfoService;
    @Autowired
    UserService userService;

    @Override
    public List<Note> queryAllHavingNote(String dealerId) {
        NoteExample noteExample=new NoteExample();
        List<Integer> integers=new ArrayList<>();
        integers.add(NoteStatCode.HELP_CONFIRMED);
        integers.add(NoteStatCode.ADMIN_CONFIRMED);
        integers.add(NoteStatCode.TIMEOUT);
        integers.add(NoteStatCode.CANCELLED);
        integers.add(NoteStatCode.ACCOUNT_FILLING);
        noteExample.createCriteria().andDealerIdEqualTo(dealerId).andStatNoNotIn(integers);
        return noteMapper.selectByExample(noteExample);
    }

    @Override
    public List<Note> queryAllHavingNote(String dealerId, String coin) {
        NoteExample noteExample=new NoteExample();
        List<Integer> integers=new ArrayList<>();
        integers.add(NoteStatCode.HELP_CONFIRMED);
        integers.add(NoteStatCode.ADMIN_CONFIRMED);
        integers.add(NoteStatCode.TIMEOUT);
        integers.add(NoteStatCode.CANCELLED);
        noteExample.createCriteria().andDealerIdEqualTo(dealerId).andStatNoNotIn(integers).andAssetCoinEqualTo(coin);
        return noteMapper.selectByExample(noteExample);
    }

    @Override
    public List<Note> queryAllClinchNote(String dealerId) {
        NoteExample noteExample=new NoteExample();
        List<Integer> integers=new ArrayList<>();
        integers.add(NoteStatCode.HELP_CONFIRMED);
        integers.add(NoteStatCode.ADMIN_CONFIRMED);
        noteExample.createCriteria().andDealerIdEqualTo(dealerId).andStatNoIn(integers);
        return noteMapper.selectByExample(noteExample);
    }

    @Override
    public List<Note> queryAllClinchNote(String dealerId, String coin) {
        NoteExample noteExample=new NoteExample();
        List<Integer> integers=new ArrayList<>();
        integers.add(NoteStatCode.HELP_CONFIRMED);
        integers.add(NoteStatCode.ADMIN_CONFIRMED);
        noteExample.createCriteria().andDealerIdEqualTo(dealerId).andStatNoIn(integers).andAssetCoinEqualTo(coin);
        return noteMapper.selectByExample(noteExample);
    }

    @Override
    public Note queryNote(String noteNo) {
        NoteExample noteExample=new NoteExample();
        noteExample.createCriteria().andNoteNoEqualTo(noteNo);
        List<Note> noteList = noteMapper.selectByExample(noteExample);
        Note note=null;
        if(noteList!=null&&noteList.size()>0){
            note =noteList.get(0);
            UserInfo userInfo=userInfoService.queryUserInfo(note.getDealerId());
            note.setDealerName(userInfo.getName());
            note.setDealerPhone(userInfo.getPhone());
        }
        return note;
    }

    @Override
    public int saveOrUpdate(Note note) {
        Note oldNote =queryNote(note.getNoteNo());
        if(oldNote==null){
            note.setStartTime(new Date());
            if(note.getFlowPath()==null){
                note.setFlowPath("");
            }
            note.setStatNo(NoteStatCode.ACCOUNT_TRANSFERRING);
            note.setFlowPath(note.getFlowPath()+"-"+ NoteStatCode.ACCOUNT_TRANSFERRING);
            if(isExist(note.getRemarkCode())){
                return -1;
            }
            User user=userService.queryUserByDealerId(note.getDealerId());

            if(user.getStat()!= UserStatCode.ONLINE){
                return -2;
            }
            return noteMapper.insert(note);//保存
        }else {
            note.setId(oldNote.getId());
            NoteExample noteExample=new NoteExample();
            noteExample.createCriteria().andNoteNoEqualTo(note.getNoteNo());
            return noteMapper.updateByExample(note,noteExample);//更新
        }
    }

    @Override
    public int queryNoteCount(String dealerId) {
        return noteMapper.selectCountBydealerId(dealerId);
    }

    @Override
    public List<Note> queryAllClinchNoteByAccount(String account, String coin) {
        NoteExample noteExample=new NoteExample();
        List<Integer> integers=new ArrayList<>();
        integers.add(NoteStatCode.HELP_CONFIRMED);
        integers.add(NoteStatCode.ADMIN_CONFIRMED);
        noteExample.createCriteria().andAccountEqualTo(account).andAssetCoinEqualTo(coin).andStatNoIn(integers);
        return noteMapper.selectByExample(noteExample);
    }

    @Override
    public List<Note> queryAllHavingNoteByAccount(String account, String coin) {
        NoteExample noteExample=new NoteExample();
        List<Integer> integers=new ArrayList<>();
        integers.add(NoteStatCode.HELP_CONFIRMED);
        integers.add(NoteStatCode.ADMIN_CONFIRMED);
        integers.add(NoteStatCode.TIMEOUT);
        integers.add(NoteStatCode.CANCELLED);
        integers.add(NoteStatCode.ACCOUNT_FILLING);
        noteExample.createCriteria().andAssetCoinEqualTo(coin).andAccountEqualTo(account).andStatNoNotIn(integers);
        return noteMapper.selectByExample(noteExample);
    }

    private boolean isExist(String code){
        int a= noteMapper.selectCodeCountByCode(code);
        if(a>0){
            return true;
        }else {
            return false;
        }
    }
}
