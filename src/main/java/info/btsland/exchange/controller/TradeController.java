package info.btsland.exchange.controller;

import com.google.gson.Gson;
import info.btsland.exchange.exception.NoteException;
import info.btsland.exchange.model.Note;
import info.btsland.exchange.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/12/13.
 */
@Controller
@RequestMapping("/trade")
public class TradeController {
    @Autowired
    private TradeService tradeService;

    @ResponseBody
    @RequestMapping(value = "/queryNoteCountByDealerId",method = RequestMethod.POST)
    public int queryNoteCountByDealerId(@RequestParam("dealerId") String dealerId){
        int a=0;
        try {
            a= tradeService.queryNoteCount(dealerId);
        } catch (NoteException e) {
            e.printStackTrace();
        }
        return a;
    }
    @ResponseBody
    @RequestMapping(value = "/createNote",method = RequestMethod.POST)
    public Note createNote(@RequestParam("account")String account,@RequestParam("coin") String coin,@RequestParam("dealerId") String dealerId){
        Note note=null;
        try {
            note = tradeService.createNote(account,coin,dealerId);
        } catch (NoteException e) {
            e.printStackTrace();
        }
        return note;
    }
    @ResponseBody
    @RequestMapping(value = "/saveNote",method = RequestMethod.POST)
    public String saveNote(@RequestParam("account")String account,String noteJson){
        Gson gson=new Gson();
        Note note=gson.fromJson(noteJson,Note.class);
        String noteNo="";
        try {
            noteNo = tradeService.saveNote(account,note);
        } catch (NoteException e) {
            e.printStackTrace();
        }
        return noteNo;
    }
    @ResponseBody
    @RequestMapping(value = "/updateNoteReal",method = RequestMethod.POST)
    public int updateNoteReal(@RequestParam("noteNo")String noteNo,@RequestParam("realNo")String realNo,@RequestParam("realType")String realType,@RequestParam("realDepict")String realDepict){
        int a=0;
        a = tradeService.updateNoteReal(noteNo,realNo,realType,realDepict);
        return a;
    }
    @ResponseBody
    @RequestMapping(value = "/updateNoteStat",method = RequestMethod.POST)
    public int updateNoteStat(@RequestParam("noteNo")String noteNo,@RequestParam("stat")int stat){
        int a=0;
        try {
            a = tradeService.updateNoteStat(noteNo,stat);
        } catch (NoteException e) {
            e.printStackTrace();
        }
        return a;
    }
    @ResponseBody
    @RequestMapping(value = "/updateNoteDepict",method = RequestMethod.POST)
    public int updateNoteDepict(@RequestParam("noteNo")String noteNo,@RequestParam("depict")String depict){
        return tradeService.updateNoteDepict(noteNo,depict);
    }
}
