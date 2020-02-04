package com.qtatelier.design.proxy_pattern;

import com.qtatelier.design.proxy_pattern.static_proxy.Dio;
import com.qtatelier.design.proxy_pattern.static_proxy.World;

/**
 *
 * @author xiaweiwei
 * @descrpition <设计模式之代理模式【客户端(可以是敌人)】>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 9:52
 */
public class ProxyPattern {
    public static void main(String [] args){
       //创建目标对象(被代理对象)Dio出现
        Dio dio = new Dio();

        //创建代理对象(替身),同时将被代理对象传递给代理对象
        World world = new World(dio);

        //通过代理对象，调用到被代理对象的方法
        //即: 执行的是代理对象的方法，代理对象再去调用对象方法
        world.stopWorld();
        world.hit();

    }
}
