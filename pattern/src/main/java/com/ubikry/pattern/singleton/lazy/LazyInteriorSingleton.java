package com.ubikry.pattern.singleton.lazy;

/**
 * 内部类实现
 * 优点：利用内部类的加载时机，避免了内存浪费和加锁消耗的性能问题
 */
public class LazyInteriorSingleton {

    private  static LazyInteriorSingleton lazyInteriorSingleton;

    public static LazyInteriorSingleton getInstance(){
        return LazyHolder.l;
    }

    private static class LazyHolder{
        private static final LazyInteriorSingleton l = new LazyInteriorSingleton();
    }

}
