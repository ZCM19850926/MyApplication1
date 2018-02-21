package com.app.lianxi.myapplication1.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;

import com.app.lianxi.myapplication1.App;

import java.io.InputStream;

/**
 * Created by dell on 2018/2/20.
 */

public class AppUtils {
    //隐藏输入法
    public static void hideInputMethod(View view){
        InputMethodManager imm=(InputMethodManager) App.context.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm.isActive()) {
            imm.hideSoftInputFromWindow(view.getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);

        }
    }






















}
