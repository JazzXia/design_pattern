package com.qtatelier.design.facade_pattern;

import com.qtatelier.design.facade_pattern.TheaterDevice.DVDPlayer;
import com.qtatelier.design.facade_pattern.TheaterDevice.PopCorn;
import com.qtatelier.design.facade_pattern.TheaterDevice.Projector;
import com.qtatelier.design.facade_pattern.TheaterDevice.Screen;
import com.qtatelier.design.facade_pattern.TheaterDevice.Stereo;
import com.qtatelier.design.facade_pattern.TheaterDevice.TheaterLight;

/**
 * @author xiaweiwei
 * @descrpition <影院的外观>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 15:58
 */
public class HomeTheaterFacade {
    /**
     * 定义各个子系统的对象
     */
    private TheaterLight theaterLight;
    private PopCorn popCorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    //构造器
    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    //操作分成4步
    public void ready() {
        theaterLight.off();
        popCorn.on();
        popCorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        theaterLight.bright();
        popCorn.off();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }


}
