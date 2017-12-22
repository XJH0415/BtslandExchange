package info.btsland.exchange.service;

import info.btsland.exchange.model.Allege;

import java.util.List;

/**
 * Created by Administrator on 2017/12/15.
 */
public interface AllegeService {
    /**
     * 创建申述单
     * @param account
     * @param noteNo
     * @return
     */
    Allege createAllege(String account,String noteNo);

    /**
     * 更新申述单
     * @param noteNo
     * @param stat
     * @return
     */
    int updateAllege(String noteNo,int stat);

    /**
     * 保存或者更新
     * @param allege
     * @return
     */
    int saveOrUpdateAllege(Allege allege);

    /**
     * 根据用户查询
     * @param account
     * @return
     */
    List<Allege> queryAllAllege(String account);

    /**
     * 根据用户查询
     * @param dealerId
     * @return
     */
    List<Allege> queryAllAllegeByDealerId(String dealerId);

    /**
     * 查询全部
     * @return
     */
    List<Allege> queryAllAllege();

    /**
     * 根据状态查询
     * @param stat
     * @return
     */
    List<Allege> queryAllAllege(int stat);
}
