package info.btsland.exchange.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import info.btsland.exchange.model.User;
import info.btsland.exchange.model.UserInfo;
import info.btsland.exchange.service.UserInfoService;
import info.btsland.exchange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/12/13.
 */
@Controller("/UserInfo")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping(value = "/updateUserInfo",method = RequestMethod.POST)
    public UserInfo updateUserInfo(@RequestParam("dealerId")String dealerId, @RequestParam("userInfo")String userInfo){
        GsonBuilder gsonBuilder=new GsonBuilder();
        Gson gson=gsonBuilder.create();
        UserInfo userInfo1 = gson.fromJson(userInfo,new TypeToken<UserInfo>(){}.getType());
        return userInfoService.updateUserInfo(dealerId,userInfo1);
    }

    @ResponseBody
    @RequestMapping(value = "/queryUserInfoByPwd",method = RequestMethod.POST)
    public UserInfo queryUserInfoByPwd(@RequestParam("dealerId") String dealerId, @RequestParam("dealerId") String password){
        User user = userService.loginDealer(dealerId,password);
        if(user!=null){
            return userInfoService.queryUserInfo(dealerId);
        }else {
            return null;
        }
    }
    @ResponseBody
    @RequestMapping(value = "/queryUserInfo",method = RequestMethod.POST)
    public UserInfo queryUserInfo(@RequestParam("dealerId") String dealerId){
        return userInfoService.queryUserInfo(dealerId);
    }
}
