package info.btsland.exchange.utils;

/**
 * Created by Administrator on 2017/12/12.
 */
public class AllegeStatCode {
    public static final int ACCOUNT_APPEALING = 11;
    public static final int ADMIN_CONFIRMED = 13;
    public static final int HELP_CONFIRMED = 15;
    public static final int ACCOUNT_CONFIRMED = 14;
    public static final int PROCESSING = 12;
    public static boolean isInclude(int stat){
        if(stat==ACCOUNT_APPEALING){
            return true;
        }
        if(stat==ADMIN_CONFIRMED){
            return true;
        }
        if(stat==HELP_CONFIRMED){
            return true;
        }
        if(stat==ACCOUNT_CONFIRMED){
            return true;
        }
        if(stat==PROCESSING){
            return true;
        }
        return false;
    }
}
