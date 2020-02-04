package com.qtatelier.design.singleton_pattern.type4;

/**
 * @author xiaweiwei
 * @descrpition<懒汉式(线程安全的,同步方法)>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 15:37
 */
public class Singleton {
    private static Singleton instance;

    public Singleton() {
    }
    //提供一个静态的公有方法,加入了synchronized防止多线程破坏单例
    //即懒汉式
    public static synchronized Singleton getInstance(){
            if (instance == null){
                instance = new Singleton();
            }
            return instance;
    }
}
