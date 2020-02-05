package com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.order;


import com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.pizza.BJCheesePizza;
import com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.pizza.BJPepperPizza;
import com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.pizza.Pizza;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 10:23
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        } else {
            System.out.println("无订购内容");
            throw new RuntimeException("无订购内容");
        }
        return pizza;
    }
}
