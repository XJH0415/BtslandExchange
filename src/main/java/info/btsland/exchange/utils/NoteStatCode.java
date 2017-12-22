package info.btsland.exchange.utils;

/**
 * Created by Administrator on 2017/12/12.
 */
public class NoteStatCode {
    public static final int ACCOUNT_FILLING=0;
    public static final int ACCOUNT_TRANSFERRING=1;
    public static final int DEALER_CONFIRMING=2;
    public static final int DEALER_TRANSFERRING=3;
    public static final int HELP_CONFIRMING=4;
    public static final int ACCOUNT_CONFIRMED=7;
    public static final int HELP_CONFIRMED=6;
    public static final int ADMIN_CONFIRMED=8;
    public static final int ADMIN_TRANSFERRING=5;
    public static final int CANCELLED=-2;
    public static final int TIMEOUT=-1;
}
