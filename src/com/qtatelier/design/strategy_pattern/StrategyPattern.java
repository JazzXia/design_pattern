package com.qtatelier.design.strategy_pattern;

import com.qtatelier.design.strategy_pattern.pattern.duck.WildDuck;
import com.qtatelier.design.strategy_pattern.pattern.fly.GoodFlyBehavior;

/**
 *
 * @author xiaweiwei
 * @descrpition <设计模式之策略模式>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 9:52
 */
public class StrategyPattern {
    public static void main(String [] args){
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();

        WildDuck wildDuck1 = new WildDuck(new GoodFlyBehavior());
        wildDuck1.display();
        wildDuck1.fly();
    }
}
