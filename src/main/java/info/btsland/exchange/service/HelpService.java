package info.btsland.exchange.service;

import info.btsland.exchange.model.Help;
import java.util.List;

public interface HelpService {
    List<Help> queryDealer(String helpId);
}
