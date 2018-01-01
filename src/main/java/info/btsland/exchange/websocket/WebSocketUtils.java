package info.btsland.exchange.websocket;

import javax.websocket.Session;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by peng on 2016/12/21 14:36.
 * description:
 */
public class WebSocketUtils {
    private static Map<String,Session> map = new ConcurrentHashMap<String,Session>();

    private static final String PREFIX="mws";

    public static void put(String userid,Session session){
        map.put(getKey(userid),session);
    }


    public static Session get(String userid){
        return map.get(getKey(userid));

    }

    public static List<Session> getOtherSession(String userid){
        List<Session> result = new ArrayList<Session>();
        Set<Map.Entry<String, Session>> set=  map.entrySet();
//        Iterator<Map.Entry<String, Session>> iterator= set.iterator();
        for(Map.Entry<String, Session> s:set){
            if(!s.getKey().equals(getKey(userid))){
                result.add(s.getValue());

            }
        }
        return result;
    }

    public static void remove(String userid){
        map.remove(getKey(userid));
    }

    public static boolean hasConnection(String userid){
        return map.containsKey(getKey(userid));
    }


    private static String getKey(String userid){
        return PREFIX+"_"+userid;
    }
}