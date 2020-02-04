package com.qtatelier.design.proxy_pattern.dynmic_proxy;


/**
 * @author xiaweiwei
 * @descrpition dio的实现
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 11:54
 */
public class Dio implements IJOJO {
    @Override
    public void hit() {
        System.out.println("Dio会打架");
    }

    @Override
    public void play() {
        System.out.println("Dio会玩");
    }

    @Override
    public void injured() {
        System.out.println("Dio会受伤");
    }

    @Override
    public void stopWorld() {
        System.out.println("暂停时间");
    }

    @Override
    public void beat(String name) {
        System.out.println("打败"+name);
    }
}
