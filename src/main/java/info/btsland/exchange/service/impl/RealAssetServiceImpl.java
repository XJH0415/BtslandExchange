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
    public int updateRealAsset(String dealerId, RealAsset realAsset) {
        int a=0;
        User user1 = userService.queryUserByDealerId(dealerId);
        if(user1!=null){
            realAsset.setDealerId(user1.getDealerId());
            if(realAsset.getId()==null||realAsset.getId().equals("")){
                RealAssetExample realAssetExample=new RealAssetExample();
                realAssetExample.createCriteria().andDealerIdEqualTo(dealerId).andRealAssetNoEqualTo(realAsset.getRealAssetNo()).andRealAssetTypeEqualTo(realAsset.getRealAssetType());
                List<RealAsset> realAssets =realAssetMapper.selectByExample(realAssetExample);
                if(realAssets!=null&&realAssets.size()>0){
                    return 0;
                }
                a=realAssetMapper.insert(realAsset);
            }else {
                RealAssetExample updateExample = new RealAssetExample();
                updateExample.createCriteria().andIdEqualTo(realAsset.getId()).andDealerIdEqualTo(realAsset.getDealerId());
                a = realAssetMapper.updateByExample(realAsset, updateExample);
            }
        }
        return a;
    }

    @Override
    public int saveRealAsset(User user,RealAsset realAsset) {
        int i=0;
        if(realAsset.getType()==1){
            User user1 = userService.loginDealer(user.getDealerId(),user.getPassword());
            if(user1!=null){
                i = realAssetMapper.insert(realAsset);
            }
        }else {
            User user1=userService.loginAccount(user.getAccount());
            if(user1!=null){
                i = realAssetMapper.insert(realAsset);
            }
        }
        return i;
    }

    @Override
    public int removeRealAsset(User user,RealAsset realAsset) {
        int a=0;
        if(realAsset.getType()==1){
            User user1 = userService.loginDealer(user.getDealerId(),user.getPassword());
            if(user1!=null){
                realAsset.setDealerId(user1.getDealerId());
                realAsset.setIsAvailable(0);
                RealAssetExample removeExample=new RealAssetExample();
                removeExample.createCriteria().andDealerIdEqualTo(realAsset.getDealerId()).andIdEqualTo(realAsset.getId());
                a=realAssetMapper.updateByExample(realAsset,removeExample);
            }
        }else {
            User user1 = userService.loginAccount(user.getAccount());
            if(user1!=null){
                realAsset.setDealerId(user1.getDealerId());
                realAsset.setIsAvailable(0);
                RealAssetExample removeExample=new RealAssetExample();
                removeExample.createCriteria().andDealerIdEqualTo(realAsset.getDealerId()).andIdEqualTo(realAsset.getId());
                a=realAssetMapper.updateByExample(realAsset,removeExample);
            }
        }

        return a;
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
