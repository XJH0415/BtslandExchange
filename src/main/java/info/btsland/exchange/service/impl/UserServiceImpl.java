package info.btsland.exchange.service.impl;

import com.google.gson.Gson;
import info.btsland.exchange.ExchangeApplication;
import info.btsland.exchange.exception.UserException;
import info.btsland.exchange.mapper.UserMapper;
import info.btsland.exchange.model.User;
import info.btsland.exchange.model.UserExample;
import info.btsland.exchange.model.UserRecord;
import info.btsland.exchange.service.RealAssetService;
import info.btsland.exchange.service.UserInfoService;
import info.btsland.exchange.service.UserRecordService;
import info.btsland.exchange.service.UserService;
import info.btsland.exchange.utils.UserStatCode;
import info.btsland.exchange.utils.UserTypeCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/8.
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserMapper userMapper;

    @Autowired
    RealAssetService realAssetService;

    @Autowired
    UserInfoService userInfoService;

    @Autowired
    UserRecordService userRecordService;

    @Override
    public User loginDealer(String dealerId, String password) {
        User user = userMapper.selectByIdAndPwd(dealerId,password);
        if(user!=null){
            user.userInfo=userInfoService.queryUserInfo(user.getDealerId());
            user.realAssets=realAssetService.queryRealAsset(user.getDealerId());
            user.userRecord=userRecordService.queryUserRecord(user.getDealerId());
        }
        return user;
    }

    @Override
    public User queryUserByDealerId(String dealerId) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria =userExample.createCriteria();
        criteria.andDealerIdEqualTo(dealerId);
        List<User> users = userMapper.selectByExample(userExample);
        logger.info("loginDealer:"+users.size()+"dealerId:"+dealerId);
        User user=null;
        if(users!=null&&users.size()>0){
            user=users.get(0);
            user.userInfo=userInfoService.queryUserInfo(user.getDealerId());
            user.realAssets=realAssetService.queryRealAsset(user.getDealerId());
            user.userRecord=userRecordService.queryUserRecord(user.getDealerId());
        }

        return user;
    }
    @Override
    public User loginAccount(String accountName) {
        logger.info("loginAccount"+accountName);
        //数据校验

        //查询用户
        UserExample userExample=new UserExample();
        userExample.createCriteria().andAccountEqualTo(accountName);
        List<User> users =userMapper.selectByExample(userExample);
        User user=null;
        if(users!=null&&users.size()>0){
            user = users.get(0);
            user.userInfo=userInfoService.queryUserInfo(user.getDealerId());
            user.realAssets=realAssetService.queryRealAsset(user.getDealerId());
            user.userRecord=userRecordService.queryUserRecord(user.getDealerId());
        }
        return user;
    }

    @Override
    public User updateStat(String dealerId, int stat) throws UserException {
        //数据校验

        //查询用户
        logger.info("dealerId:"+dealerId+",stat:"+stat);
        User user=queryUserByDealerId(dealerId);
        logger.info(""+user);
        //更改状态
        if(user!=null){
            if(!UserStatCode.isInclude(stat)){
                throw new UserException("无法更新此状态！");
            }
            user.setStat(stat);
            UserExample userExample=new UserExample();
            userExample.createCriteria().andDealerIdEqualTo(user.getDealerId());
           if(userMapper.updateByExample(user,userExample)>0){
               logger.info(user.toString());
               user=queryUserByDealerId(user.getDealerId());
               return user;
           }else {
               throw new UserException("更新失败！");
           }
        }
        return null;
    }


    @Override
    public int registerAccount(String accountName,String password) {
        User newUser=null;
        //数据校验


        //写入数据
        User user=new User();
        user.setAccount(accountName);
        user.setDealerId(accountName);
        user.setPassword(password);
        user.setStat(-1);
        user.setType(0);
        return userMapper.insert(user);
    }

    @Override
    public User upAccount(String dealerId,int type) throws UserException {
        //数据校验

        //升级
        User user=queryUserByDealerId(dealerId);
        if(user==null){
            throw new UserException("数据库无改用户");
        }
        if(!UserTypeCode.isInclude(type)){
            throw new UserException("无法升级为此type");
        }
        user.setType(type);
        if(userMapper.updateByPrimaryKey(user)==0){
            user=null;
        }
        return user;
    }

    @Override
    public User loginAdmin(String dealerId, String password) {
        User user =userMapper.selectByIdAndPwd(dealerId,password);
        if (user.getType()==5){
            return user;
        }else {
            return null;
        }
    }

    @Override
    public User loginHelp(String dealerId, String password) {
        User user =userMapper.selectByIdAndPwd(dealerId,password);
        if (user.getType()==4){
            return user;
        }else {
            return null;
        }
    }

    @Override
    public List<User> queryAllDealer(int stat) {
        UserExample userExample=new UserExample();
        List<User> users=null;
        if(stat==0){
            userExample.createCriteria().andTypeEqualTo(UserTypeCode.DEALER);
        }else {
            userExample.createCriteria().andStatEqualTo(stat).andTypeEqualTo(UserTypeCode.DEALER);
        }
        users=userMapper.selectByExample(userExample);
        for(int i=0;i<users.size();i++){
            users.get(i).userInfo=userInfoService.queryUserInfo(users.get(i).getDealerId());
            users.get(i).realAssets=realAssetService.queryRealAsset(users.get(i).getDealerId());
            users.get(i).userRecord=userRecordService.queryUserRecord(users.get(i).getDealerId());
        }
        return users;
    }

    @Override
    public User updateUserPassword(String dealerId,String oldPassword ,String newPassword) {
        User user = loginDealer(dealerId,oldPassword);
        if(user!=null){
            user.setPassword(newPassword);
            UserExample userExample=new UserExample();
            userExample.createCriteria().andDealerIdEqualTo(dealerId);
            int a = userMapper.updateByExample(user,userExample);
            if(a>0){
                user=loginDealer(dealerId,newPassword);
            }else {
                user=null;
            }
        }
        return user;
    }

    @Override
    public int updateUser(String dealerId, String user) {
        int a = 0;
        Gson gson = new Gson();
        logger.info(dealerId + ":" + user);
        User user1 = gson.fromJson(user, User.class);
        logger.info(user1.toString());
        if (user1 != null) {
            User oldUser = queryUserByDealerId(dealerId);
            if(oldUser==null){
                return 0;
            }
            oldUser.setBrokerageIn(user1.getBrokerageIn());
            oldUser.setBrokerageOut(user1.getBrokerageOut());
            oldUser.setDealerName(user1.getDealerName());
            oldUser.setLowerLimitIn(user1.getLowerLimitIn());
            oldUser.setLowerLimitOut(user1.getLowerLimitOut());
            oldUser.setUpperLimitOut(user1.getUpperLimitOut());
            oldUser.setDepict(user1.getDepict());
            UserExample userExample = new UserExample();
            userExample.createCriteria().andDealerIdEqualTo(dealerId);
            if (this.userMapper.selectByExample(userExample) != null) {
                a = this.userMapper.updateByExample(oldUser, userExample);
            }
        }

        logger.info("a:" + a);
        return a;
    }


}
