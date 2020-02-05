package com.qtatelier.design.factory_pattern.simple_factory_pattern.traditional.pizzastore.pizza;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-05 10:16
 */
//将pizza做成抽象
public abstract class Pizza {
    /**
     * 名字
     */
    protected String name;

    /**
     * 准备原材料,不同的pizza的原材料是不一样的
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking...");
    }

    public void cut() {
        System.out.println(name + "cutting...");
    }

    public void box() {
        System.out.println(name + "boxing...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
