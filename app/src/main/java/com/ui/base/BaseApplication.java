package com.ui.base;

import android.app.Application;

/**
 * Application的基类
 * Created by lu_hang on 2017/11/1.
 */

public class BaseApplication extends Application {

    private static BaseApplication mBaseApplication;

    @Override
    public void onCreate() {
        super.onCreate();

        mBaseApplication = this;
        //初始化日志开关

        //初始化图片加载工具类

        //初始化网络
        initNet();

    }

    /**
     * 初始化网络
     */
    private void initNet() {
    }

    /**
     * 获取Application的实例
     *
     * @return
     */
    public static Application newInstance() {
        return mBaseApplication;
    }

}
