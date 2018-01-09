package info.btsland.exchange.controller;


import info.btsland.exchange.model.Chat;
import info.btsland.exchange.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    ChatService charService;

    @ResponseBody
    @RequestMapping(value="/queryChat",method = RequestMethod.POST)
    public List<Chat> queryChat(@RequestParam("from") String from,@RequestParam("to") String to){
        return charService.queryChat(from,to);
    }

    @ResponseBody
    @RequestMapping(value="/queryDealer",method = RequestMethod.POST)
    public List<String> queryDealer(@RequestParam("account") String account){
        List<String> accounts1 = charService.queryDealerIdByFrom(account);
        List<String> accounts2 = charService.queryDealerIdByTo(account);
        List<String> listAll=new LinkedList<>();
        listAll.addAll(accounts1);
        listAll.addAll(accounts2);
        listAll=new ArrayList<>(new LinkedHashSet<>(listAll));
        return listAll;
    }
    @ResponseBody
    @RequestMapping(value="/queryDealerIdByFrom",method = RequestMethod.POST)
    public List<String> queryDealerIdByFrom(@RequestParam("from")String from){
        List<String> strings = charService.queryDealerIdByFrom(from);
        return strings;
    }
    @ResponseBody
    @RequestMapping(value="/queryDealerIdByTo",method = RequestMethod.POST)
    public List<String> queryDealerIdByTo(@RequestParam("to")String to){
        List<String> strings = charService.queryDealerIdByTo(to);
        return strings;
    }
    @ResponseBody
    @RequestMapping(value="/sendChat",method = RequestMethod.POST)
    public int sendChat(@RequestParam("from")String from,@RequestParam("context")String context,@RequestParam("to")String to){
        return charService.sendChat(from,context,to);
    }
    @ResponseBody
    @RequestMapping(value="/deleteChar",method = RequestMethod.POST)
    public int deleteChar(@RequestParam("from")String from,@RequestParam("to")String to, @RequestParam("time")String time){
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
