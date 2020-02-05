package com.qtatelier.design;

import com.qtatelier.design.facade_pattern.HomeTheaterFacade;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 16:06
 */
public class Client {
    public static void main(String[] args) {
        //统一调用
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();

        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
