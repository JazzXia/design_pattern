package com.qtatelier.design.factory_pattern.simple_factory_pattern.traditional.pizzastore.order;

import com.qtatelier.design.factory_pattern.simple_factory_pattern.traditional.pizzastore.pizza.CheesePizza;
import com.qtatelier.design.factory_pattern.simple_factory_pattern.traditional.pizzastore.pizza.GreekPizza;
import com.qtatelier.design.factory_pattern.simple_factory_pattern.traditional.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 10:23
 */
public class OrderPizza {

    //构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = gettype();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("芝士披萨");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }


    //写一个方法获取用户订购pizza的类型

    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = null;
            str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


}
