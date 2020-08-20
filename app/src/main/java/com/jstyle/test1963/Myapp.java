package com.jstyle.test1963;

import android.app.Application;

import com.jstyle.test1963.Util.SharedPreferenceUtils;
import com.jstyle.test1963.ble.BleManager;
import com.jstyle.test1963.daomananger.DbManager;

public class Myapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DbManager.init(this);
        SharedPreferenceUtils.init(this);
        BleManager.init(this);
    }
}
