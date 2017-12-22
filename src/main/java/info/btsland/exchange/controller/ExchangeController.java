package info.btsland.exchange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/12/9.
 */
@Controller
public class ExchangeController {
    @RequestMapping("/welcome")
    public String index(){
        return "index";
    }
}
