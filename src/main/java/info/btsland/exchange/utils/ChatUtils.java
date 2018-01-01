package info.btsland.exchange.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.DateTypeAdapter;
import info.btsland.exchange.model.Chat;

import java.util.Date;

public class ChatUtils {
    private static Gson gson;

    public static String getFrom(String message){
        Chat chat=toChat(message);
        return chat.getFromUser();
    }

    public static String getTo(String message) {
        Chat chat=toChat(message);
        return chat.getToUser();
    }

    public static String getMessage(String message) {
        Chat chat=toChat(message);
        return chat.getContext();
    }

    public static Chat toChat(String message){
        init();
        Chat chat=gson.fromJson(message,Chat.class);
        return chat;
    }
    public static String toJson(Chat chat){
        init();
        String message=gson.toJson(chat);
        return message;
    }
    private static void init(){
        if(gson==null){
            GsonBuilder gsonBuilder=new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Date.class,new DateTypeAdapter());
            gson=gsonBuilder.create();
        }
    }
}
