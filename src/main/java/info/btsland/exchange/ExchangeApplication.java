package info.btsland.exchange;

import info.btsland.exchange.model.User;
import info.btsland.exchange.service.UserRecordService;
import info.btsland.exchange.service.UserService;
import info.btsland.exchange.thread.BaseThread;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.*;

@SpringBootApplication
@MapperScan("info.btsland.exchange.mapper")
@EnableTransactionManagement
@EnableScheduling
public class ExchangeApplication {

    private static final Logger logger = LoggerFactory.getLogger(ExchangeApplication.class);
	public static Map<String,IThread> threadMap=new HashMap<>();

	private
	@Autowired
	static UserService userService;

	@Autowired
	static UserRecordService userRecordService;

	public static void main(String[] args) {
		SpringApplication.run(ExchangeApplication.class, args);
		threadMap.put("UpdateUserRecordThread",new IThread("UpdateUserRecordThread"));

	}
	/**
	 * 更新用户记录线程
	 */
	public static class IThread extends BaseThread {
        public IThread(String threadName) {
            super(threadName);
        }
        @Override
        protected void execute() {
            List<User> userList = userService.queryAllDealer(0);
            for(int i=0;i<userList.size();i++){
                userRecordService.saveOrUpdate(userList.get(i).getDealerId());
            }
        }
	}
}