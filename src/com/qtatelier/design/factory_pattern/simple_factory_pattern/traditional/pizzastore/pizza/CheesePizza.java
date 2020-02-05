package com.qtatelier.design.factory_pattern.simple_factory_pattern.traditional.pizzastore.pizza;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 10:20
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备芝士Pizza的原材料...");
    }



}
