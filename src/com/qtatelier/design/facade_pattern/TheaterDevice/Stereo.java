package com.qtatelier.design.facade_pattern.TheaterDevice;

/**
 * @author xiaweiwei
 * @descrpition <屏幕>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 15:47
 */
public class Stereo {

    //使用单例饿汉式
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Stereo ON");
    }

    public void off() {
        System.out.println("Stereo OFF");
    }

}
