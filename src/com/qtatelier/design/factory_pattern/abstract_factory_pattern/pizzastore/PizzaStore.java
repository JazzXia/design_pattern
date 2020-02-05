package com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore;

import com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore.order.LDFactory;
import com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore.order.OrderPizza;

/**
 * @author xiaweiwei
 * @descrpition<抽象工厂模式>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 10:30
 */
public class PizzaStore {
    public static void main(String [] args){
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }

}
