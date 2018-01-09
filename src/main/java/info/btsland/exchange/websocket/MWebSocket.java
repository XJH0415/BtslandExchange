package info.btsland.exchange.websocket;

import info.btsland.exchange.model.Chat;
import info.btsland.exchange.service.ChatService;
import info.btsland.exchange.utils.ChatUtils;
import info.btsland.exchange.utils.EmojiUitil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;


@ServerEndpoint("/ws/{userId}")
@Controller
public class MWebSocket {

    ChatService chatService;

    ApplicationContext applicationContext;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @OnOpen
    public void onOpen(@PathParam("userId") String userId, Session session) {
        logger.info("onOpen:"+userId);
        WebSocketUtils.put(userId, session);
    }

    @OnMessage
    public void onMessage(String message,@PathParam("userId") String userId) throws IOException {
        logger.info("onMessage:"+userId);
        broadcast(message);
    }

    @OnError
    public void onError(@PathParam("userId") String userId, Throwable t) {
        logger.info("onError:"+userId);
        logger.info("onError:"+t.getMessage());
        WebSocketUtils.remove(userId);
    }

    @OnClose
    public void onClose(@PathParam("userId") String userId) {
        logger.info("onClose:"+userId);
        WebSocketUtils.remove(userId);
    }
    private void broadcast(String message) {
        String text=message;
        try {
            logger.info(message);
            text = EmojiUitil.emojiToText(message);
            logger.info(text);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String finalText = text;
        new Thread(new Runnable() {
            @Override
            public void run() {
                Chat chat=ChatUtils.toChat(finalText);
                chat.setTime(new Date());
                logger.info("broadcast"+chat);
                if(chatService==null){
                    chatService = (ChatService)SpringUtil2.getBean("chatService");
                }
                logger.info(String.valueOf(chatService==null));
                try {
                    chatService.save(chat);//保存数据
                    Session session = WebSocketUtils.get(chat.getToUser());
                    if (null != session && session.isOpen()) {
                        session.getAsyncRemote().sendText(message);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();

    }


}
