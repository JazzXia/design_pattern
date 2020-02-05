package com.qtatelier.design.facade_pattern.TheaterDevice;

/**
 * @author xiaweiwei
 * @descrpition <DVD>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 15:47
 */
public class DVDPlayer {

    //使用单例饿汉式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("DVD ON");
    }

    public void off(){
        System.out.println("DVD OFF");
    }

    public void play(){
        System.out.println("DVD IS PLAYING");
    }
    public void pause(){
        System.out.println("DVD HAS PAUSED");
    }
}
