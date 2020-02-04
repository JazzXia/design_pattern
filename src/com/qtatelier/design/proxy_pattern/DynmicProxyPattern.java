package com.qtatelier.design.proxy_pattern;

import com.qtatelier.design.proxy_pattern.dynmic_proxy.IJOJO;
import com.qtatelier.design.proxy_pattern.dynmic_proxy.ProxyFactory;
import com.qtatelier.design.proxy_pattern.dynmic_proxy.Dio;

/**
 *
 * @author xiaweiwei
 * @descrpition <设计模式之代理模式【客户端(可以是敌人)】>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 9:52
 */
public class DynmicProxyPattern {
    public static void main(String [] args){

        //动态代理

        //创建目标对象
        IJOJO target = new Dio();
        //给目标对象创建代理对象
        IJOJO proxyInstance = (IJOJO) new ProxyFactory(target).getProxyInstance();
        //proxyInstance= class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("proxyInstance=" + proxyInstance.getClass());
        //通过代理对象调用目标对象方法
        proxyInstance.stopWorld();
        proxyInstance.beat("花京院典明");
    }
}
