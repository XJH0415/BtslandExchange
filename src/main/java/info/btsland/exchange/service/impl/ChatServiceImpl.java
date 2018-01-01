package info.btsland.exchange.service.impl;

import info.btsland.exchange.mapper.ChatMapper;
import info.btsland.exchange.model.Chat;
import info.btsland.exchange.model.ChatExample;
import info.btsland.exchange.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ChatServiceImpl implements ChatService {
    @Autowired
    ChatMapper chatMapper ;
    @Override
    public List<Chat> queryChat(String from, String to) {
        return chatMapper.selectByFromAndTo(from,to);
    }

    @Override
    public int sendChat(String from, String context, String to) {
        Chat chat=new Chat();
        chat.setToUser(to);
        chat.setFromUser(from);
        chat.setContext(context);
        if(chat.getTime()==null){
            chat.setTime(new Date());
        }
        return chatMapper.insert(chat);
    }

    @Override
    public int deleteChar(String from, String to, Date time) {
        ChatExample chatExample1=new ChatExample() ;
        chatExample1.createCriteria().andFromUserEqualTo(from).andToUserEqualTo(to);
        ChatExample chatExample2=new ChatExample() ;
        chatExample2.createCriteria().andFromUserEqualTo(to).andToUserEqualTo(from);
        int a = chatMapper.deleteByExample(chatExample1);
        a+=chatMapper.deleteByExample(chatExample2);
        return a;
    }

    @Override
    public int save(Chat chat) {
        if(chat.getTime()==null){
            chat.setTime(new Date());
        }
        return chatMapper.insert(chat);
    }
}
