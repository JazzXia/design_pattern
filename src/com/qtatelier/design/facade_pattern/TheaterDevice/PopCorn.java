package com.qtatelier.design.facade_pattern.TheaterDevice;

/**
 * @author xiaweiwei
 * @descrpition <爆米花机>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 15:47
 */
public class PopCorn {

    //使用单例饿汉式
    private static PopCorn instance = new PopCorn();

    public static PopCorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("PopCorn ON");
    }

    public void off() {
        System.out.println("PopCorn OFF");
    }

    public void play() {
        System.out.println("PopCorn IS PLAYING");
    }

    public void pause() {
        System.out.println("PopCorn HAS PAUSED");
    }

    public void pop() {
        System.out.println("PopCorn POP");
    }
}
