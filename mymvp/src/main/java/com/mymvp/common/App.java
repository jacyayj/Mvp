package com.mymvp.common;

import android.app.Application;

import com.orhanobut.logger.Logger;

import org.xutils.x;

/**
 * Created by jacyayj on 2016/7/14.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        Logger.init("jacy");
    }
}
