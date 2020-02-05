package com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.order;


import com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.pizza.LDCheesePizza;
import com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.pizza.LDPepperPizza;
import com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.pizza.Pizza;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 10:23
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
