package com.ubikry.pattern.singleton.register;

/**
 * 枚举通常作为常量来使用，而常量就是大家公用的
 * 通常在API中使用
 */
public enum  EnumSingleton {

    INSTANCE;


    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
