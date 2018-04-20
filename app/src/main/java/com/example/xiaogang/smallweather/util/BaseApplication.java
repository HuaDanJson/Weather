package com.example.xiaogang.smallweather.util;

import android.app.Application;
import android.content.Context;

import com.blankj.utilcode.util.Utils;


/**
 * Created by xcc on 2015/12/16.
 */
public class BaseApplication extends Application {


    public static Context mAppContext = null;


    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext = getApplicationContext();
        Utils.init(getApplicationContext());
    }



    public static Context getmAppContext() {
        return mAppContext;
    }


}
