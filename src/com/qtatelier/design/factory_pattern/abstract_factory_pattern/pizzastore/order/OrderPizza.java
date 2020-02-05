package com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore.order;


import com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore.pizza.Pizza;

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

    AbstractFactory abstractFactory;


    public OrderPizza(AbstractFactory abstractFactory) {
        setFactory(abstractFactory);
    }

    private void setFactory(AbstractFactory factory) {
        Pizza pizza = null;
        String orderType = "";//用户输入
        this.abstractFactory = factory;

        do {
            orderType = gettype();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败!");
                break;
            }

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
