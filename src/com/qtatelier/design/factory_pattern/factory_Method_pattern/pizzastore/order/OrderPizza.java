package com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.order;


import com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.pizza.Pizza;

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
public abstract class OrderPizza {

    public OrderPizza() {
        do {
            String orderType;
            Pizza pizza = null;
            orderType = gettype();
            pizza = createPizza(orderType);//抽象方法,由工厂子类完成
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    //定义一个抽象方法,createPizza，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);


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
