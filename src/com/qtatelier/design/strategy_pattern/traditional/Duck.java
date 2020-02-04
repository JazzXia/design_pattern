package com.qtatelier.design.strategy_pattern.traditional;

/**
 * @author xiaweiwei
 * @descrpition <策略模式>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 10:08
 */
public abstract class Duck {
    public Duck() {

    }

    public void quack() {
        System.out.println("鸭子嘎嘎叫~~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~~");
    }

    public void fly(){
        System.out.println("鸭子会飞翔~~");
    }

    //显示鸭子信息
    public abstract void display();
}
