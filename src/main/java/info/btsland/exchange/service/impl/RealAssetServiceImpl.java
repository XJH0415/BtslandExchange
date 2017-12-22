package info.btsland.exchange.service.impl;

import info.btsland.exchange.mapper.RealAssetMapper;
import info.btsland.exchange.model.RealAsset;
import info.btsland.exchange.model.RealAssetExample;
import info.btsland.exchange.model.User;
import info.btsland.exchange.service.RealAssetService;
import info.btsland.exchange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/11.
 */
@Service
public class RealAssetServiceImpl implements RealAssetService {
    @Autowired
    UserService userService;
    @Autowired
    RealAssetMapper realAssetMapper;

    @Override
    public RealAsset updateRealAsset(User user, RealAsset realAsset) {
        //数据校验

        //数据更新
        User user1 = userService.loginDealer(user.getDealerId(),user.getPassword());
        RealAsset realAsset1=null;
        if(user1!=null){
            realAsset.setDealerId(user1.getDealerId());
            RealAssetExample updateExample=new RealAssetExample();
            updateExample.createCriteria().andIdEqualTo(realAsset.getId()).andDealerIdEqualTo(realAsset.getDealerId());
            if(realAssetMapper.updateByExample(realAsset,updateExample)>0){
                realAsset1 = queryRealAsset(realAsset.getId(),realAsset.getDealerId());
            }
        }
        return realAsset1;
    }

    @Override
    public int saveRealAsset(RealAsset realAsset) {
        int i=0;
        i = realAssetMapper.insert(realAsset);
        return i;
    }

    @Override
    public RealAsset removeRealAsset(User user,RealAsset realAsset) {
        User user1 = userService.loginDealer(user.getDealerId(),user.getPassword());
        RealAsset realAsset1=null;
        if(user1!=null){
            realAsset.setDealerId(user1.getDealerId());
            realAsset.setIsAvailable(0);
            RealAssetExample removeExample=new RealAssetExample();
            removeExample.createCriteria().andDealerIdEqualTo(realAsset.getDealerId()).andIdEqualTo(realAsset.getId());
            if(realAssetMapper.updateByExample(realAsset,removeExample)>0){
                realAsset1 = queryRealAsset(realAsset.getId(),realAsset.getDealerId());
            }
        }
        return realAsset1;
    }

    @Override
    public List<RealAsset> queryRealAsset(String dealerId) {
        //数据校验

        //查询数据
        List<RealAsset> realAssets=null;
        RealAssetExample selectExample=new RealAssetExample();
        selectExample.createCriteria().andDealerIdEqualTo(dealerId).andIsAvailableEqualTo(1);
        realAssets = realAssetMapper.selectByExample(selectExample);
        return realAssets;
    }

    @Override
    public RealAsset queryRealAsset(int id, String dealerId) {
        //数据校验

        //查询数据
        RealAsset realAsset=null;
        List<RealAsset> realAssets = queryRealAsset(dealerId);
        for(int i=0;i<realAssets.size();i++){
            if(realAssets.get(i).getId()==id){
                realAsset=realAssets.get(i);
            }
        }
        return realAsset;
    }
}
