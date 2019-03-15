package com.ubikry.pattern.singleton.hungry;

/**
 * 静态单例
 */
public class HungryStaticSingleton {
    private static  final  HungryStaticSingleton h;
    static {
        h = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstens(){
        return h;
    }


}
