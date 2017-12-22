package info.btsland.exchange.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/12/12.
 */
public class NoteNoCode {
    private static int a=0;

    public static void reset() {
        NoteNoCode.a = 0;
    }

    public static String createNoteNoCode(){
        a++;
        SimpleDateFormat format=new SimpleDateFormat("YYYYMMddhhmmss");
        String code = format.format(new Date());
        if(a-10000<0){
            if(a-1000<0){
                if(a-100<0){
                    if(a-10<0){
                        return code+"0000"+String.valueOf(a);
                    }
                    return code+"000"+String.valueOf(a);
                }
                return code+"00"+String.valueOf(a);
            }
            return code+"0"+String.valueOf(a);
        }
        return code+String.valueOf(a);
    }
}
