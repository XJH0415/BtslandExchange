package info.btsland.exchange.websocket;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import info.btsland.exchange.model.Chat;
import info.btsland.exchange.service.ChatService;
import info.btsland.exchange.service.impl.ChatServiceImpl;
import info.btsland.exchange.utils.ChatUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by peng on 2016/12/21 14:25.
 * description:
 */
@ServerEndpoint("/websocket/{userId}")
public class MWebSocket {

    @Autowired
    ChatService chatService;

    @OnOpen
    public void onOpen(@PathParam("userId") String userId, Session session) {
        WebSocketUtils.put(userId, session);
    }

    @OnMessage
    public void onMessage(String message,@PathParam("userId") String userId) throws IOException {
        broadcast(message);
    }

    @OnError
    public void onError(@PathParam("userId") String userId, Throwable t) {
        WebSocketUtils.remove(userId);
    }

    @OnClose
    public void onClose(@PathParam("userId") String userId) {
        WebSocketUtils.remove(userId);
    }

    private void broadcast(String message) {
        Chat chat=ChatUtils.toChat(message);
        chat.setTime(new Date());
        chatService.save(chat);
        Session session = WebSocketUtils.get(chat.getToUser());
        if (null != session && session.isOpen()) {
            session.getAsyncRemote().sendText(ChatUtils.toJson(chat));
        } else {
            //获取自己的session
            Session self = WebSocketUtils.get(chat.getFromUser());
            chat.setContext("-1");
            self.getAsyncRemote().sendText(ChatUtils.toJson(chat));
        }

    }
}
