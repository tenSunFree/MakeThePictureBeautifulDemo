package com.example.administrator.makethepicturebeautifuldemo;

import android.app.Application;
import android.graphics.Color;

import com.yyx.beautifylib.utils.BLConfig;
import com.yyx.beautifylib.utils.BLConfigManager;

/**
 * Created by Administrator on 2017/4/25.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        BLConfigManager.register(new BLConfig())
                .statusBarColor(Color.parseColor("#52733b"))                               //设置状态栏颜色
                .toolBarColor(Color.parseColor("#84a45a"))                                 //设置toolbar颜色
                .primaryColor(Color.parseColor("#d4237a"));                                //设置应用primary颜色
    }
}
