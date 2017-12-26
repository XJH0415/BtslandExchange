package info.btsland.exchange.controller;


import info.btsland.exchange.model.Chat;
import info.btsland.exchange.service.CharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    CharService charService ;

    @ResponseBody
    @RequestMapping(value="/queryChat",method = RequestMethod.POST)
    List<Chat> queryChat(@RequestParam("from") String from,@RequestParam("to") String to){
        return charService.queryChat(from,to);
    }
    @ResponseBody
    @RequestMapping(value="/sendChat",method = RequestMethod.POST)
    int sendChat(@RequestParam("from")String from,@RequestParam("context")String context,@RequestParam("to")String to){
        return charService.sendChat(from,context,to);
    }
    @ResponseBody
    @RequestMapping(value="/deleteChar",method = RequestMethod.POST)
    int deleteChar(@RequestParam("from")String from,@RequestParam("to")String to, @RequestParam("time")String time){
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd hh:mm;ss");
        Date date=null;
        try {
            date = dateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return charService.deleteChar(from,to,date);
    }
}
