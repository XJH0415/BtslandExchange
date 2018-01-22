package info.btsland.exchange.service;

import info.btsland.exchange.model.User;
import info.btsland.exchange.model.UserInfo;

/**
 * Created by Administrator on 2017/12/11.
 */
public interface UserInfoService {
    /**
     * 更新用户信息
     * @param userInfo
     * @return
     */
    UserInfo updateUserInfo(String dealerId, UserInfo userInfo);

    /**
     * 更新用户积分
     * @param dealerId
     * @param level
     * @return
     */
    int updateUserInfo(String dealerId,Double level);

    /**
     * 更新用户积分
     * @param userInfo
     * @param level
     * @return
     */
    int updateUserInfo(UserInfo userInfo,Double level);

    /**
     * 创建用户信息
     * @param user
     * @param userInfo
     * @return
     */
    UserInfo createUserInfo(User user,UserInfo userInfo);

    /**
     * 查询用户信息
     * @param dealerId
     * @return
     */
    UserInfo queryUserInfo(String dealerId);
}
