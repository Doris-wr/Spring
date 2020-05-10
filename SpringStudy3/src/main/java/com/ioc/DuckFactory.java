package com.ioc;

/**
 * @Author:wangrui
 * @Date:2020/5/10 17:20
 */
public class DuckFactory {

    public Duck create(){
        return new Duck("duck5");
    }

    public static Duck create2(){
        return new Duck("duck6");
    }
}
