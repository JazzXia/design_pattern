package com.qtatelier.design.strategy_pattern.pattern.duck;

import com.qtatelier.design.strategy_pattern.pattern.fly.FlyBehavior;
import com.qtatelier.design.strategy_pattern.pattern.fly.GoodFlyBehavior;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 10:10
 */
public class WildDuck extends Duck {
    public WildDuck(){
        flyBehavior = new GoodFlyBehavior();
    }

    public WildDuck(FlyBehavior flyBehavior){
        super(flyBehavior);
    }
    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
