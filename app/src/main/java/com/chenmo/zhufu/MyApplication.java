package com.chenmo.zhufu;

import android.app.Application;

import cn.sharesdk.framework.ShareSDK;

/**
 * 作者：沉默
 * 日期：2017/3/10
 * QQ:823925783
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ShareSDK.initSDK(this);
    }
}
