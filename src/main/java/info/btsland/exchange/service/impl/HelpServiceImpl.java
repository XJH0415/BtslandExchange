package info.btsland.exchange.service.impl;

import info.btsland.exchange.mapper.HelpMapper;
import info.btsland.exchange.model.Help;
import info.btsland.exchange.model.HelpExample;
import info.btsland.exchange.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HelpServiceImpl implements HelpService {
    @Autowired
    HelpMapper helpMapper ;

    @Override
    public List<Help> queryDealer(String helpId) {
        HelpExample helpExample =new HelpExample() ;
        helpExample.createCriteria().andHelpIdEqualTo(helpId);
        return helpMapper.selectByExample(helpExample);
    }
}
