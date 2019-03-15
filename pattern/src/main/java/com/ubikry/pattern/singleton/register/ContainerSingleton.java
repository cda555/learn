package com.ubikry.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 注册式单例
 * 优点：方便管理多个对象
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> map = new ConcurrentHashMap<String,Object>();
    public static Object getInstance(String className){
        synchronized (map) {
            if (!map.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    map.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return map.get(className);
            }
        }
    }
}
