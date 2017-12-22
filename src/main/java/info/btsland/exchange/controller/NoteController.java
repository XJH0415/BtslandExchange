package info.btsland.exchange.controller;

import info.btsland.exchange.model.Note;
import info.btsland.exchange.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2017/12/8.
 */
@Controller
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private NoteService noteService;

    /**
     * 查询进行中的订单
     * @param dealerId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryAllHavingNoteDealer",method =RequestMethod.POST)
    public List<Note> queryAllHavingNote(@RequestParam("dealerId") String dealerId){
        return noteService.queryAllHavingNote(dealerId);
    }
    /**
     * 查询进行中的订单
     * @param dealerId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryAllHavingNoteByDealerAndCoin",method =RequestMethod.POST)
    public List<Note> queryAllHavingNote(@RequestParam("dealerId")String dealerId,@RequestParam("coin")String coin){
        return noteService.queryAllHavingNote(dealerId,coin);
    }

    /**
     * 查询已完成订单
     * @param dealerId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryAllClinchNoteDealer",method =RequestMethod.POST)
    public List<Note> queryAllClinchNote(@RequestParam("dealerId")String dealerId){
        return noteService.queryAllClinchNote(dealerId);
    }

    /**
     * 查询已完成订单
     * @param dealerId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryAllClinchNoteByDealerAndCoin",method =RequestMethod.POST)
    public List<Note> queryAllClinchNote(@RequestParam("dealerId")String dealerId,@RequestParam("coin")String coin){
        return noteService.queryAllClinchNote(dealerId,coin);
    }

    /**
     * 根据流水号查询一条订单
     * @param noteNo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryNote",method =RequestMethod.POST)
    public Note queryNote(@RequestParam("noteNo")String noteNo){
        return noteService.queryNote(noteNo);
    }


    /**
     * 根据承兑商查询订单数
     * @param dealerId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryNoteCount",method =RequestMethod.POST)
    public int queryNoteCount(@RequestParam("dealerId")String dealerId){
        return noteService.queryNoteCount(dealerId);
    }

    /**
     * 查询用户完成的交易记录
     * @param account
     * @param coin
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryNoteClinchCountByAccountAndCoin",method =RequestMethod.POST)
    public List<Note> queryAllClinchNoteByAccount(@RequestParam("account")String account,@RequestParam("coin")String coin){
        return noteService.queryAllClinchNoteByAccount(account,coin);
    }
    /**
     * 查询用户进行中的的交易记录
     * @param account
     * @param coin
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryNoteHavingCountByAccountAndCoin",method =RequestMethod.POST)
    public List<Note> queryAllHavingNoteByAccount(@RequestParam("account")String account,@RequestParam("coin")String coin){
        return noteService.queryAllHavingNoteByAccount(account,coin);

    }

}
