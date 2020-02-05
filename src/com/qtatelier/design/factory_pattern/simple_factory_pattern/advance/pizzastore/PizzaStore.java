package com.qtatelier.design.factory_pattern.simple_factory_pattern.advance.pizzastore;

import com.qtatelier.design.factory_pattern.simple_factory_pattern.advance.pizzastore.order.OrderPizza;
import com.qtatelier.design.factory_pattern.simple_factory_pattern.advance.pizzastore.order.SimpleFactory;

/**
 * @author xiaweiwei
 * @descrpition<简单工厂模式/静态工厂模式>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 10:30
 */
public class PizzaStore {
    public static void main(String [] args){
        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序~~~");
    }

}
