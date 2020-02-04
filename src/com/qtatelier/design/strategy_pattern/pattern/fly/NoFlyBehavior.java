package com.qtatelier.design.strategy_pattern.pattern.fly;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 10:49
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("这个鸭子不会飞翔");
    }
}
