package com.qtatelier.design.singleton_pattern.type3;

/**
 * @author xiaweiwei
 * @descrpition<懒汉式(线程不安全的)>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 15:37
 */
public class Singleton {
    private static Singleton instance;

    public Singleton() {
    }
    //提供一个静态的公有方法,当使用到该方法时，采取创建instance
    //即懒汉式
    public static Singleton getInstance(){
            if (instance == null){
                instance = new Singleton();
            }
            return instance;
    }
}
