package info.btsland.exchange.controller;

import info.btsland.exchange.ExchangeApplication;
import info.btsland.exchange.exception.UserException;
import info.btsland.exchange.model.User;
import info.btsland.exchange.model.UserInfo;
import info.btsland.exchange.service.RealAssetService;
import info.btsland.exchange.service.UserInfoService;
import info.btsland.exchange.service.UserRecordService;
import info.btsland.exchange.service.UserService;
import info.btsland.exchange.utils.UserTypeCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.nio.cs.US_ASCII;

import java.util.List;

/**
 * Created by Administrator on 2017/12/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private RealAssetService realAssetService;

    @Autowired
    private UserRecordService userRecordService;
    @ResponseBody
    @RequestMapping(value = "/loginDealer",method = RequestMethod.POST)
    public User loginDealer(@RequestParam("dealerId") String dealerId, @RequestParam("password") String password){
        return userService.loginDealer(dealerId,password);
    }
    @ResponseBody
    @RequestMapping(value = "/loginAccount",method =RequestMethod.POST )
    public User loginAccount(@RequestParam("dealerId") String dealerId){
        User user = userService.loginAccount(dealerId);
        user.setPassword("");
        return user;
    }
    @ResponseBody
    @RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
    public User loginAdmin(@RequestParam("dealerId") String dealerId, @RequestParam("password")String password){
        return userService.loginAdmin(dealerId,password);
    }
    @ResponseBody
    @RequestMapping(value = "/loginHelp", method = RequestMethod.POST)
    public User loginHelp(@RequestParam("dealerId") String dealerId, @RequestParam("password")String password){
        return userService.loginAdmin(dealerId,password);
    }
    @ResponseBody
    @RequestMapping(value = "/queryDealer",method =RequestMethod.POST)
    public User queryDealer(@RequestParam("dealerId")String dealerId){
        User user = userService.queryUserByDealerId(dealerId);
        user.setPassword("");
        return user;
    }
    @ResponseBody
    @RequestMapping(value = "/queryAccount",method =RequestMethod.POST)
    public User queryAccount(@RequestParam("account")String account){
        ExchangeApplication.logger.info("queryAccount  account:"+account);
        User user = userService.loginAccount(account);
        if(user!=null){
            if(user.getType()== UserTypeCode.DEALER) {
                user = userService.queryUserByDealerId(user.getDealerId());
            }
        }else {
            int a = userService.registerAccount(account,"");
            if(a>0){
                user = userService.loginAccount(account);
            }
        }

        return user;
    }
    @ResponseBody
    @RequestMapping(value = "/queryAllDealer",method =RequestMethod.POST)
    public List<User> queryAllDealer(@RequestParam("stat")int stat){
        List<User> users = userService.queryAllDealer(stat);
        for (int i=0;i<users.size();i++){
            UserInfo userInfo = userInfoService.queryUserInfo(users.get(i).getDealerId());
            users.get(i).setPassword("");//擦除密码
            users.get(i).userInfo=userInfo;//设置详细信息
            users.get(i).userRecord=userRecordService.queryUserRecord(users.get(i).getDealerId());
            users.get(i).realAssets = realAssetService.queryRealAsset(users.get(i).getDealerId());
        }
        return users;
    }

    /**
     * 更新状态
     * @param dealerId
     * @param stat
     * @return
     * @throws UserException
     */
    @ResponseBody
    @RequestMapping(value = "/updateStat",method =RequestMethod.POST)
    public User updateStat(@RequestParam("dealerId")String dealerId,@RequestParam("stat")int stat) {
        try {
            return userService.updateStat(dealerId,stat);
        } catch (UserException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 创建承兑商
     * @param accountName
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/registerAccount",method =RequestMethod.POST)
    public int registerAccount(@RequestParam("accountName") String accountName,@RequestParam("password")String password){
        return userService.registerAccount(accountName,password);
    }

    /**
     * 更新用户的类型
     * @param dealerId
     * @param type
     * @return
     * @throws UserException
     */
    @ResponseBody
    @RequestMapping(value = "/upAccount",method =RequestMethod.POST)
    public User upAccount(@RequestParam("dealerId")String dealerId,@RequestParam("type")int type) throws UserException{
        return userService.upAccount(dealerId,type);
    }

    @ResponseBody
    @RequestMapping(value = "/updateUserPassword",method =RequestMethod.POST)
    public User updateUserPassword(@RequestParam("dealerId")String dealerId,@RequestParam("oldPassword")String oldPassword ,@RequestParam("newPassword")String newPassword){
        return userService.updateUserPassword(dealerId,oldPassword,newPassword);
    }
    @ResponseBody
    @RequestMapping(value = "/updateUser",method =RequestMethod.POST)
    public int updateUser(@RequestParam("dealerId")String dealerId,@RequestParam("user")String user){
        return userService.updateUser(dealerId,user);
    }
}
