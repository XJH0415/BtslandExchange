package info.btsland.exchange;

import info.btsland.exchange.model.User;
import info.btsland.exchange.service.UserRecordService;
import info.btsland.exchange.service.UserService;
import info.btsland.exchange.thread.BaseThread;
import info.btsland.exchange.websocket.MWebSocket;
import info.btsland.exchange.websocket.SpringUtil2;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.*;

@SpringBootApplication
@MapperScan("info.btsland.exchange.mapper")
@EnableTransactionManagement
@EnableScheduling
@ComponentScan(basePackages={"info.btsland.exchange"})
public class ExchangeApplication {

    public static final Logger logger = LoggerFactory.getLogger(ExchangeApplication.class);

    @Bean
	public SpringUtil2 getSpringUtil2(){
		return new SpringUtil2();
	}

	public static void main(String[] args) {
		SpringApplication.run(ExchangeApplication.class, args);
	}

}
