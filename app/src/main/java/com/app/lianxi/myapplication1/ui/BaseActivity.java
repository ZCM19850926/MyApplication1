package com.app.lianxi.myapplication1.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.widget.Toast;

import java.util.ArrayList;

import static okhttp3.internal.Util.closeAll;

/**
 * Created by dell on 2018/2/14.
 */

public class BaseActivity extends AppCompatActivity {
    private static ArrayList<Activity> activities = new ArrayList<>();//存放所有activity的引用
    public static int screenWidth, screenHight;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        activities.add(this);
        //获取屏幕尺寸
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        screenWidth = dm.widthPixels;
        screenHight = dm.heightPixels;
    }

    private long exitTime = 0;

    /***
     * 在按一次推出程序
     * @param  keyCode
     * @param event
     * @return
     *
     *
     *
     *
     * */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                showToast("在按一次退出程序");
                exitTime = System.currentTimeMillis();
            }
        } else {
            closeAll();
            System.exit(0);
        }
        return true;
    }

/**
 * 关闭所有Activity界面
 *
 * */
public static void closeAll() {
    for (int i = 0; i < activities.size(); i++) {
        activities.get(i).finish();

    }
}


/**
 * 提示
 * */
    public void showToast(String text){
        Toast.makeText(BaseActivity.this,text, Toast.LENGTH_SHORT).show();



    }
}
