package com.app.lianxi.myapplication1;

import android.app.Application;
import android.content.Context;

import cn.bmob.v3.Bmob;

/**
 * Created by dell on 2018/2/14.
 */

public class App extends Application {
    public static Context context;


    @Override
    public void onCreate() {
        super.onCreate();
//初始化bmob
        Bmob.initialize(this,"17dbf3280d5b5eeb3114dc8de02e76a8");
context=getApplicationContext();


















    }
}
