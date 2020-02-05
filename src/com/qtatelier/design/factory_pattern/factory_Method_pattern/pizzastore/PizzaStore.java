package com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore;

import com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.order.BJOrderPizza;

/**
 * @author xiaweiwei
 * @descrpition<工厂方法模式>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 10:30
 */
public class PizzaStore {
    public static void main(String [] args){
        //使用简单工厂模式
        new BJOrderPizza();
        System.out.println("退出程序~~~");
    }

}
