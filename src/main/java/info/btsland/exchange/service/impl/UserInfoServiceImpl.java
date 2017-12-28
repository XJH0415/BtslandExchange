package info.btsland.exchange.service.impl;

import info.btsland.exchange.mapper.UserInfoMapper;
import info.btsland.exchange.model.User;
import info.btsland.exchange.model.UserInfo;
import info.btsland.exchange.model.UserInfoExample;
import info.btsland.exchange.service.UserInfoService;
import info.btsland.exchange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/11.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    UserService userService;

    @Override
    public UserInfo updateUserInfo(String dealerId,String password, UserInfo userInfo) {
        //数据检验

        //查询数据
        User user1 = userService.loginDealer(dealerId,password);
        UserInfo newInfo=null;
        if(user1!=null){
            UserInfo oldInfo = queryUserInfo(user1.getDealerId());
            if(user1.getDealerId().equals(oldInfo.getDealerId())){
                UserInfoExample updateExample=new UserInfoExample();
                updateExample.createCriteria().andDealerIdEqualTo(oldInfo.getDealerId());
                if(userInfoMapper.updateByExample(userInfo,updateExample)>0){
                    newInfo=queryUserInfo(oldInfo.getDealerId());
                }
            }
        }
        return newInfo;
    }

    @Override
    public int updateUserInfo(String dealerId, Double level) {
        UserInfo userInfo1 = queryUserInfo(dealerId);
        userInfo1.setLevel(userInfo1.getLevel()+level);
        UserInfoExample userInfoExample=new UserInfoExample();
        userInfoExample.createCriteria().andDealerIdEqualTo(dealerId);
        return userInfoMapper.updateByExample(userInfo1,userInfoExample);
    }

    @Override
    public int updateUserInfo(UserInfo userInfo, Double level) {
        userInfo.setLevel(userInfo.getLevel()+level);
        UserInfoExample userInfoExample=new UserInfoExample();
        userInfoExample.createCriteria().andDealerIdEqualTo(userInfo.getDealerId());
        return userInfoMapper.updateByExample(userInfo,userInfoExample);
    }

    @Override
    public UserInfo createUserInfo(User user,UserInfo userInfo) {
        //数据校验

        //创建用户消息
        User user1 = userService.loginDealer(user.getDealerId(),user.getPassword());
        UserInfo userInfo1=null;
        if(user1!=null){
            userInfo.setDealerId(user1.getDealerId());
            userInfoMapper.insert(userInfo);
            UserInfoExample selectExample=new UserInfoExample();
            selectExample.createCriteria().andDealerIdEqualTo(userInfo.getDealerId());
            List<UserInfo> userInfos=userInfoMapper.selectByExample(selectExample);
            if(userInfo!=null&&userInfos.get(0)!=null){
                userInfo1=userInfos.get(0);
            }
        }
        return userInfo1;
    }

    @Override
    public UserInfo queryUserInfo(String dealerId) {
        //数据校验

        //查询数据
        UserInfo userInfo=null;
        UserInfoExample selectExample=new UserInfoExample();
        selectExample.createCriteria().andDealerIdEqualTo(dealerId);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(selectExample);
        if(userInfos!=null&&userInfos.size()>0&&userInfos.get(0)!=null){
            userInfo=userInfos.get(0);
        }
        return userInfo;
    }
}
