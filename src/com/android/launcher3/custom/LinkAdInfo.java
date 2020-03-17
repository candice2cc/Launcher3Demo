package com.android.launcher3.custom;

public class LinkAdInfo extends AdInfo{
    public static final int OPEN_TYPE_DEFAULT = 0;
    public static final int OPEN_TYPE_PC = 1;

    // 点击跳转url地址
    public String clickUrl;

    // icon url地址
    public String iconUrl;

    // 打开方式：0：内部打开(默认)；1：PC浏览器打开
    public int openType = OPEN_TYPE_DEFAULT;


}
