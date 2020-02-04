package com.qtatelier.design.singleton_pattern.type2;

/**
 * @author xiaweiwei
 * @descrpition<饿汉式(静态代码块)>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 15:37
 */
public class Singleton {
    //1.构造器私有化，外部不能new
    private Singleton() {
    }

    //2.本类内部创建对象实例
    private static Singleton instance = new Singleton();

    static { //在静态代码块中创建单例对象
        instance = new Singleton();
    }


    //3.提供一个共有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
