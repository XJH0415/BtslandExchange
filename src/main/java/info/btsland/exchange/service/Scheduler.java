package info.btsland.exchange.service;

import info.btsland.exchange.ExchangeApplication;
import info.btsland.exchange.utils.NoteNoCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/14.
 */
@Component
public class Scheduler {
    @Autowired
    UserRecordService userRecordService;
    @Autowired
    UserService userService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Scheduled(fixedRate=30000) //每30秒执行一次
    public void statusCheck() {
        logger.info("更新承兑商交易信息");
        for(String key : ExchangeApplication.threadMap.keySet()){
            ExchangeApplication.IThread iThread=ExchangeApplication.threadMap.get(key);
            if(iThread.isRun()){
                iThread.reStart();
            }else {
                iThread.start();
            }
        }

    }

    @Scheduled(cron="0 0 0 * * ?") //每天凌晨执行
    public void resetting() {
        logger.info("重置流水号");
        NoteNoCode.reset();//重置流水号
    }

    @Scheduled(fixedRate=20000)//每20秒执行一次
    public void testTasks() {
    }


}