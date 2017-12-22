package info.btsland.exchange.service.impl;

import info.btsland.exchange.mapper.AllegeMapper;
import info.btsland.exchange.model.Allege;
import info.btsland.exchange.model.AllegeExample;
import info.btsland.exchange.model.Note;
import info.btsland.exchange.service.AllegeService;
import info.btsland.exchange.service.NoteService;
import info.btsland.exchange.utils.AllegeStatCode;
import info.btsland.exchange.utils.NoteStatCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/15.
 */
@Service
public class AllegeServiceImpl implements AllegeService {
    @Autowired
    NoteService noteService;
    @Autowired
    AllegeMapper allegeMapper;

    @Override
    public Allege createAllege(String account, String noteNo) {
        Note note = noteService.queryNote(noteNo);
        Allege allege=null;
        if(note!=null){
            allege = new Allege();
            allege.setAccount(account);
            allege.setNoteNo(noteNo);
            allege.setStatNo(AllegeStatCode.ACCOUNT_APPEALING);
            noteService.queryNote(noteNo);
        }
        return allege;
    }

    @Override
    public int updateAllege(String noteNo, int stat) {
        Allege allege = queryAllege(noteNo);
        int a=0;
        if(AllegeStatCode.isInclude(stat)){
            if(allege!=null){
                allege.setStatNo(stat);
                a = saveOrUpdateAllege(allege);
            }
        }

        return a;
    }

    @Override
    public int saveOrUpdateAllege(Allege allege) {
        int a=0;
        Allege allege1 = queryAllege(allege.getNoteNo());
        allege.setId(allege1.getId());
        if(allege1!=null){
            AllegeExample allegeExample=new AllegeExample();
            allegeExample.createCriteria().andDealerIdNotEqualTo(allege.getNoteNo());
            a = allegeMapper.updateByExample(allege,allegeExample);
        }else {
            allegeMapper.insert(allege);
        }
        return a;
    }

    @Override
    public List<Allege> queryAllAllege(String account) {
        AllegeExample allegeExample=new AllegeExample();
        allegeExample.createCriteria().andAccountEqualTo(account);
        List<Allege> alleges = allegeMapper.selectByExample(allegeExample);
        return alleges;
    }

    @Override
    public List<Allege> queryAllAllegeByDealerId(String dealerId) {
        AllegeExample allegeExample=new AllegeExample();
        allegeExample.createCriteria().andDealerIdEqualTo(dealerId);
        List<Allege> alleges = allegeMapper.selectByExample(allegeExample);
        return alleges;
    }

    @Override
    public List<Allege> queryAllAllege() {
        return allegeMapper.selectByExample(new AllegeExample());
    }

    @Override
    public List<Allege> queryAllAllege(int stat) {
        AllegeExample allegeExample=new AllegeExample();
        allegeExample.createCriteria().andStatNoEqualTo(stat);
        List<Allege> alleges = allegeMapper.selectByExample(allegeExample);
        return alleges;
    }

    public Allege queryAllege(String noteNo) {
        AllegeExample allegeExample=new AllegeExample();
        allegeExample.createCriteria().andNoteNoEqualTo(noteNo);
        List<Allege> alleges = allegeMapper.selectByExample(allegeExample);
        if(alleges!=null&&alleges.size()>0){
            return alleges.get(0);
        }
        return null;
    }
}
