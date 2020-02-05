package com.qtatelier.design.facade_pattern.TheaterDevice;

/**
 * @author xiaweiwei
 * @descrpition <DVD>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 15:47
 */
public class TheaterLight {

    //使用单例饿汉式
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("TheaterLight ON");
    }

    public void off() {
        System.out.println("TheaterLight OFF");
    }

    public void dim() {
        System.out.println("TheaterLight DIM");

    }

    public void bright() {
        System.out.println("TheaterLight bright");
    }
}
