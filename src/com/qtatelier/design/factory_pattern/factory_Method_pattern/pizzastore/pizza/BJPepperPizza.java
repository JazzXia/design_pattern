package com.qtatelier.design.factory_pattern.factory_Method_pattern.pizzastore.pizza;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 11:09
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println(name + "准备原材料");
    }
}
