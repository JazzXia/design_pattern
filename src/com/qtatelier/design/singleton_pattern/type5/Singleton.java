package com.qtatelier.design.singleton_pattern.type5;

/**
 * @author xiaweiwei
 * @descrpition<双重检查【优秀的解决方法】>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 15:37
 */
public class Singleton {

    private static volatile Singleton instance;

    public Singleton() {
    }
    //提供一个静态的公有方法,加入了双重检查代码,解决线程安全问题，同时解决懒加载问题
    //即懒汉式
    public static synchronized Singleton getInstance(){
            if (instance == null){
                synchronized (Singleton.class){
                    if (instance == null){
                        instance = new Singleton();
                    }
                }
            }
            return instance;
    }
}
