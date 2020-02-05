package com.qtatelier.design.facade_pattern.TheaterDevice;

/**
 * @author xiaweiwei
 * @descrpition <投影仪>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 15:47
 */
public class Projector {

    //使用单例饿汉式
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector ON");
    }

    public void off() {
        System.out.println("Projector OFF");
    }

    public void play() {
        System.out.println("Projector IS PLAYING");
    }

    public void pause() {
        System.out.println("Projector HAS PAUSED");
    }

    public void focus() {
        System.out.println("Projector is FOCUSING");
    }
}
