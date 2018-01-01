package info.btsland.exchange.controller;

import info.btsland.exchange.model.Help;
import info.btsland.exchange.model.User;
import info.btsland.exchange.service.HelpService;
import info.btsland.exchange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/help")
public class HelpController {
    @Autowired
    HelpService helpService ;

    @Autowired
    UserService userService ;

    @ResponseBody
    @RequestMapping(value = "/queryDealer",method = RequestMethod.POST)
    public List<User> queryDealer(@RequestParam("helpId") String helpId){
        List<Help> helps =helpService.queryDealer(helpId);
        List<User> users =null;
        if(helps!=null&&helps.size()>0){
            users =new ArrayList<>();
            for(int i=0;i<helps.size();i++){
               User user = userService.queryUserByDealerId( helps.get(i).getDealerId());
               if(user!=null){
                   user.setPassword("");
                   users.add(user);
               }
            }
        }
        return users;

    }
}
