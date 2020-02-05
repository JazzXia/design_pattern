package com.qtatelier.design.factory_pattern.abstract_factory_pattern.pizzastore.pizza;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 11:09
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println(name + "准备原材料");
    }
}
