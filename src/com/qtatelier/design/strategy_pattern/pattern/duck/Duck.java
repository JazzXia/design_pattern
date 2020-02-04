package com.qtatelier.design.strategy_pattern.pattern.duck;

import com.qtatelier.design.strategy_pattern.pattern.fly.FlyBehavior;

/**
 * @author xiaweiwei
 * @descrpition <策略模式>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 10:08
 */
public abstract class Duck {
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void quack() {
    }

    public void swim() {
    }

    public void fly(){
        if (flyBehavior != null ){
            flyBehavior.fly();
        }
    }

    //显示鸭子信息
    public abstract void display();

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
