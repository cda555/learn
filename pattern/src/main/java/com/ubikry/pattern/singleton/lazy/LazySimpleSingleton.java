package com.ubikry.pattern.singleton.lazy;

/**
 * 简单的懒加载
 * 优点：外部需要时才进行初始化
 * 缺点：频繁的获得锁，效率低下
 */
public class LazySimpleSingleton {

    private static  LazySimpleSingleton lazy = null;

    private LazySimpleSingleton(){}

    public static synchronized LazySimpleSingleton getInstance(){
        if(lazy == null){//如果为空则创建
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
