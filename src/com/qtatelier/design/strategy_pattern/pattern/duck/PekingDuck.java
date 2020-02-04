package com.qtatelier.design.strategy_pattern.pattern.duck;

import com.qtatelier.design.strategy_pattern.pattern.fly.BadFlyBehavior;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 10:10
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭!");
    }

    //因为北京鸭不能飞行,因此需要重写fly

}
