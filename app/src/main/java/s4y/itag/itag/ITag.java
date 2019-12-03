package s4y.itag.itag;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

import s4y.itag.ITagApplication;
import s4y.itag.ble.BLEDefault;
import s4y.itag.ble.BLEInterface;

public  class ITag {
    private static final HandlerThread thread = new HandlerThread("BLEDefault Main Thread");
    static final Handler handler = new Handler(thread.getLooper());
    public static final int BLE_TIMEOUT = 60;
    public static final int SCAN_TIMEOUT = 25;
    public static BLEInterface ble;
    public static ITagsStoreInterface store;

    public static void initITag(Context context) {
       assert(ble != null) ;
       ble = BLEDefault.shared(ITagApplication.context);
       store = new ITagsStoreDefault(ITagApplication.context);
    }

}
