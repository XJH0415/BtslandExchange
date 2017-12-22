package info.btsland.exchange.controller;

import info.btsland.exchange.model.Allege;
import info.btsland.exchange.service.AllegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/12/9.
 */
@Controller
@RequestMapping("/allege")
public class AllegeController {
    @Autowired
    AllegeService allegeService;
    /**
     * 创建申述单
     * @param account
     * @param noteNo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "createAllege",method = RequestMethod.POST)
    public Allege createAllege(@RequestParam("account") String account,@RequestParam("account") String noteNo){
        return allegeService.createAllege(account,noteNo);
    }

    /**
     * 更新申述单
     * @param noteNo
     * @param stat
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "updateAllege",method = RequestMethod.POST)
    int updateAllege(@RequestParam("noteNo")String noteNo,@RequestParam("stat")int stat){
        return allegeService.updateAllege(noteNo,stat);
    }

    /**
     * 根据用户查询
     * @param account
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "queryAllAllegeByAccount",method = RequestMethod.POST)
    List<Allege> queryAllAllege(@RequestParam("account")String account){
        return allegeService.queryAllAllege(account);
    }

    /**
     * 根据用户查询
     * @param dealerId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "queryAllAllegeByDealerId",method = RequestMethod.POST)
    List<Allege> queryAllAllegeByDealerId(@RequestParam("dealerId")String dealerId){
        return allegeService.queryAllAllegeByDealerId(dealerId);
    }

    /**
     * 查询全部
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "queryAllAllege")
    List<Allege> queryAllAllege(){
        return allegeService.queryAllAllege();
    }

    /**
     * 根据状态查询
     * @param stat
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "queryAllAllegeByStat",method = RequestMethod.POST)
    List<Allege> queryAllAllege(@RequestParam("stat")int stat){
        return allegeService.queryAllAllege(stat);
    }
}
