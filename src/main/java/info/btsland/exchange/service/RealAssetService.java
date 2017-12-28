package info.btsland.exchange.service;

import info.btsland.exchange.model.RealAsset;
import info.btsland.exchange.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/12/11.
 */
public interface RealAssetService {
    int updateRealAsset(User user,RealAsset realAsset);

    int saveRealAsset(User user,RealAsset realAsset);

    int removeRealAsset(User user,RealAsset realAsset);

    List<RealAsset> queryRealAsset(String dealerId);

    RealAsset queryRealAsset(int id,String dealerId);
}
