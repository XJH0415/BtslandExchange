package info.btsland.exchange.service;

import info.btsland.exchange.ExchangeApplication;
import info.btsland.exchange.model.User;
import info.btsland.exchange.thread.BaseThread;
import info.btsland.exchange.utils.NoteNoCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String,IThread> threadMap=new HashMap<>();

    @Scheduled(fixedRate=60000) //每60秒执行一次
    public void statusCheck() {
        List<User> userList = userService.queryAllDealer(0);
        for(int i=0;i<userList.size();i++){
            String dealerId=userList.get(i).getDealerId();
            if(threadMap.get(dealerId)==null){
                IThread iThread=new IThread(dealerId,dealerId);
                iThread.setTime(10);
                iThread.start();
                threadMap.put(dealerId,iThread);
            }
        }

    }

    @Scheduled(cron="0 0 0 * * ?") //每天凌晨执行
    public void resetting() {
        NoteNoCode.reset();//重置流水号
    }

    @Scheduled(fixedRate=20000)//每20秒执行一次
    public void testTasks() {
    }


    /**
     * 更新用户记录线程
     */
    class IThread extends BaseThread {
        private String dealerId;

        public IThread(String dealerId,String threadName) {
            super(threadName);
            this.dealerId=dealerId;
        }
        @Override
        protected void execute() {
            userRecordService.saveOrUpdate(dealerId);
        }
    }

}