package com.ubikry.pattern.singleton.hungry;

/**
 * 饿汗单例模式
 * 优点：实现简单，没有加任何的锁。
 * 缺点：浪费资源，如果类一直没有被使用。
 */
public class Hungry {

    // 类加载时就初始化
    private  final static Hungry hungry= new Hungry();

    // 私有化构造方法
    private Hungry(){ }

    //
    public static Hungry getInstance(){
        return hungry;
    }
}
