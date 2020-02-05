package com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore.order;

import com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore.pizza.Pizza;

/**
 * @author xiaweiwei
 * @descrpition <抽象工厂模式的抽象层(接口)>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 15:20
 */
public interface AbstractFactory {

    Pizza createPizza(String orderType);
}
