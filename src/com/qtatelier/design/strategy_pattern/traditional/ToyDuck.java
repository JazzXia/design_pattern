package com.qtatelier.design.strategy_pattern.traditional;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 10:10
 */
public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是玩具鸭!");
    }

    //因为北京鸭不能飞行,因此需要重写fly


    @Override
    public void fly() {
        System.out.println("玩具鸭不能飞翔!");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫!");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不能游泳!");
    }
}
