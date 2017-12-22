package info.btsland.exchange.service;

import info.btsland.exchange.model.Note;
import info.btsland.exchange.model.UserRecord;

/**
 * Created by Administrator on 2017/12/14.
 */
public interface UserRecordService {
    /**
     * 计算成交总单充值数
     * @return
     */
    int reckonNoteInClinchCount(String dealerId);

    /**
     * 计算进行中充值单数
     * @return
     */
    int reckonNoteInHavingCount(String dealerId);

    /**
     * 计算成交充值总额
     * @return
     */
    double reckonNoteInClinchTotal(String dealerId);

    /**
     * 计算进行中充值总额
     * @return
     */
    double reckonNoteInHavingTotal(String dealerId);

    /**
     * 计算成交提现总单数
     * @return
     */
    int reckonNoteOutClinchCount(String dealerId);

    /**
     * 计算进行中提现单数
     * @return
     */
    int reckonNoteOutHavingCount(String dealerId);

    /**
     * 计算成交提现总额
     * @return
     */
    double reckonNoteOutClinchTotal(String dealerId);

    /**
     * 计算进行中提现总额
     * @return
     */
    double reckonNoteOutHavingTotal(String dealerId);

    /**
     * 计算完成时间(分钟数)
     * @return
     */
    double reckonNoteTime(String dealerId);

    /**
     * 保存或者更新
     * @param dealerId
     * @return
     */
    int saveOrUpdate(String dealerId);

    /**
     * 根据承兑商帐号查询用户记录
     * @param dealerId
     * @return
     */
    UserRecord queryUserRecord(String dealerId);

    /**
     * 计算积分
     * @param dealerId
     * @param noteNo
     * @return
     */
    int reckonLevel(String dealerId,String noteNo);
}
