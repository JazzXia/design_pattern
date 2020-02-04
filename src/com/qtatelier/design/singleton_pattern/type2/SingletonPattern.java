package com.qtatelier.design.singleton_pattern.type2;

/**
 * @author xiaweiwei
 * @descrpition<单例模式>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 15:36
 */
public class SingletonPattern {
    public static void main(String [] args){
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
    }
}