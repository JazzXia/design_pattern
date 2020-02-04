package com.qtatelier.design.proxy_pattern.static_proxy;

/**
 * @author xiaweiwei
 * @descrpition <Dio的替身，世界的实现【静态代理对象】>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 11:54
 */
public class World implements IJOJO {

    //目标对象，通过接口来聚合
    private IJOJO target;

    public World(IJOJO target) {
        this.target = target;
    }

    @Override
    public void hit() {
        System.out.println("替身攻击开始。。。。。。");
        target.hit();
        System.out.println("替身攻击结束。。。。。。");
    }

    @Override
    public void play() {
        System.out.println("替身玩开始。。。。。。");
        target.play();
        System.out.println("替身玩结束。。。。。。");
    }

    @Override
    public void injured() {
        System.out.println("替身受伤开始。。。。。。");
        target.injured();
        System.out.println("替身受伤结束。。。。。。");
    }

    @Override
    public void stopWorld() {
        System.out.println("暂停时间开始。。。。。。");
        hit();
        System.out.println("暂停时间结束。。。。。。");
    }
}
