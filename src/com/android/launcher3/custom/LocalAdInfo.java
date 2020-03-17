package com.android.launcher3.custom;

import android.content.Intent;
import android.graphics.Bitmap;

/**
 * 系统内置支持了几种LocalAdInfo跳转，服务端可以配置其在Launcher的入口位置显示
 * 比如：游戏中心福利入口页面schema，内置icon或者
 */
public class LocalAdInfo extends AdInfo{
    /**
     * The intent used to start the application.
     */
    public Intent intent;

    /**
     * A bitmap version of the application icon.
     */
    public Bitmap iconBitmap;



}
