package com.qtatelier.design.factory_pattern.simple_factory_pattern.advance.pizzastore.order;

import com.qtatelier.design.factory_pattern.simple_factory_pattern.advance.pizzastore.pizza.CheesePizza;
import com.qtatelier.design.factory_pattern.simple_factory_pattern.advance.pizzastore.pizza.GreekPizza;
import com.qtatelier.design.factory_pattern.simple_factory_pattern.advance.pizzastore.pizza.Pizza;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 10:44
 */
//简单工厂类
public class SimpleFactory {

    //更具orderType 返回对应的Pizza对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");

        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("芝士披萨");
        }
        return pizza;
    }
}
