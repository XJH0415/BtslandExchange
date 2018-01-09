package info.btsland.exchange.controller;

import com.google.gson.Gson;
import info.btsland.exchange.model.RealAsset;
import info.btsland.exchange.model.User;
import info.btsland.exchange.service.RealAssetService;
import info.btsland.exchange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/12/27.
 */
@Controller
@RequestMapping("/realAsset")
public class RealAssetController {
    @Autowired
    RealAssetService realAssetService;
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping(value = "/updateRealAsset",method = RequestMethod.POST)
    public int updateRealAsset(@RequestParam("dealerId") String dealerId,@RequestParam("realAsset") String realAsset){
        Gson gson=new Gson();
        RealAsset realAsset1 =gson.fromJson(realAsset,RealAsset.class);
        return realAssetService.updateRealAsset(dealerId,realAsset1);
    }
    @ResponseBody
    @RequestMapping(value = "/saveRealAsset",method = RequestMethod.POST)
    public int saveRealAsset(@RequestParam("dealerId") String dealerId,@RequestParam("password") String password,@RequestParam("account") String account,@RequestParam("realAsset") String realAsset){
        User user1 = new User() ;
        user1.setDealerId(dealerId);
        user1.setPassword(password);
        user1.setAccount(account);
        Gson gson=new Gson();
        RealAsset realAsset1 =gson.fromJson(realAsset,RealAsset.class);
        return realAssetService.saveRealAsset(user1,realAsset1);
    }
    @ResponseBody
    @RequestMapping(value = "/removeRealAsset",method = RequestMethod.POST)
    public int removeRealAsset(@RequestParam("dealerId") String dealerId,@RequestParam("password") String password,@RequestParam("account") String account,@RequestParam("realAsset") String realAsset){
        User user1 = new User() ;
        user1.setDealerId(dealerId);
        user1.setPassword(password);
        user1.setAccount(account);
        Gson gson=new Gson();
        RealAsset realAsset1 =gson.fromJson(realAsset,RealAsset.class);
        return realAssetService.removeRealAsset(user1,realAsset1);
    }
    @ResponseBody
    @RequestMapping(value = "/queryRealAsset",method = RequestMethod.POST)
    public List<RealAsset> queryRealAsset(@RequestParam("dealerId")String dealerId){
        return realAssetService.queryRealAsset(dealerId);
    }
}
