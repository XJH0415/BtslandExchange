package info.btsland.exchange.service;

import info.btsland.exchange.exception.UserException;
import info.btsland.exchange.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/12/8.
 */
public interface UserService {
    /**
     * 登录
     * @param dealerId
     * @param password
     * @return
     */
    User loginDealer(String dealerId, String password);

    /**
     * 根据帐号查询用户
     * @param dealerId
     * @return
     */
    User queryUserByDealerId(String dealerId);

    /**
     * 普通用户登录
     * @param accountName
     * @return
     */
    User loginAccount(String accountName);

    /**
     * 更新状态
     * @param dealerId
     * @param stat
     * @return
     */
    User updateStat(String dealerId,String password,int stat) throws UserException;

    /**
     * 创建承兑商
     * @param accountName
     * @param password
     * @return
     */
    User registerAccount(String accountName,String password);

    /**
     * 更新用户的类型
     * @param dealerId
     * @param type
     * @return
     * @throws UserException
     */
    User upAccount(String dealerId,int type) throws UserException;

    /**
     * 管理员登录
     * @param account
     * @param password
     * @return
     */
    User loginAdmin(String account, String password);

    /**
     * 客服登录
     * @param account
     * @param password
     * @return
     */
    User loginHelp(String account, String password);

    List<User> queryAllDealer(int stat);

 }
