package info.btsland.exchange.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Administrator on 2017/12/11.
 */
public class RemarkcodeUitil {
    public static String to52Jinzhi(int data) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int scale = str.length(); //转化目标进制
        String s = "";
        if(data==0)
        {
            return str.charAt(0)+"";
        }
        while(data > 0){
            if(data < scale){
                s = str.charAt(data) + s;
                data = 0;
            }else{
                int r = data%scale;
                s = str.charAt(r) + s;
                data  = (data-r)/scale;
            }
        }
        return s;
    }
    public static String createCode(){
        Random ra =new Random();
        String s="";
        for(int i=0;i<6;i++){
            s+=to52Jinzhi(ra.nextInt(52));
        }
        return s;
    }
}
