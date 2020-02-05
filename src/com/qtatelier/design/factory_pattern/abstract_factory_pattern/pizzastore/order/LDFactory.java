package com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore.order;

import com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore.pizza.LDCheesePizza;
import com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore.pizza.LDPepperPizza;
import com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore.pizza.Pizza;

/**
 * @author xiaweiwei
 * @descrpition <工厂子类>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 15:22
 */
public class LDFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        } else {
            System.out.println("无订购内容");
            throw new RuntimeException("无订购内容");
        }
        return pizza;
    }
}
