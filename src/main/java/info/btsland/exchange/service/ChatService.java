package info.btsland.exchange.service;
import info.btsland.exchange.model.Chat;

import java.util.Date;
import java.util.List;

public interface ChatService {
    List<Chat> queryChat(String account1, String account2);

    int sendChat(String from,String context,String to);

    int deleteChar(String from,String to, Date time);

    int save(Chat chat);
}
