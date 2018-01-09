package info.btsland.exchange.service.impl;

import info.btsland.exchange.mapper.ChatMapper;
import info.btsland.exchange.model.Chat;
import info.btsland.exchange.model.ChatExample;
import info.btsland.exchange.service.ChatService;
import info.btsland.exchange.utils.EmojiUitil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service(value = "chatService")
public class ChatServiceImpl implements ChatService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ChatMapper chatMapper ;
    @Override
    public List<Chat> queryChat(String from, String to) {
        List<Chat> newChats=new ArrayList<>();
        List<Chat> oldChats=chatMapper.selectByFromAndTo(from,to);
        if(oldChats!=null&&oldChats.size()>0){
            for(int i =oldChats.size()-1; i>=0;i--){
                Chat chat=oldChats.get(i);
                String context="";
                try {
                    context =  EmojiUitil.textToEmoji(chat.getContext());
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                chat.setContext(context);
                newChats.add(chat);
            }
        }
        return newChats;
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
        int a = chatMapper.insert(chat);
        logger.info(""+a);
        return a;
    }

    @Override
    public List<String> queryDealerIdByFrom(String from) {
        return chatMapper.queryDealerIdByFrom(from);
    }

    @Override
    public List<String> queryDealerIdByTo(String to) {
        return chatMapper.queryDealerIdByTo(to);
    }
}
