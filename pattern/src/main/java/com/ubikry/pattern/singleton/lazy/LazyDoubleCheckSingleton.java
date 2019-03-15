package com.ubikry.pattern.singleton.lazy;

/**
 * 懒加载双重检查锁
 * 优点：效率高，多数情况下不需要锁，
 * 缺点：
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){//如果多个线程同时运行了这行代码，
            // 则会同时去获得锁，所以需要再次检查。
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
