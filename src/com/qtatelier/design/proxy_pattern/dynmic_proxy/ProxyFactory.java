package com.qtatelier.design.proxy_pattern.dynmic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiaweiwei
 * @descrpition<代理工厂【替身工厂,所有的替身都在里面】>
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 14:49
 */
public class ProxyFactory {

    //维护一个目标对象,object
    private Object target;

    /**
     * 构造器,对target进行初始化
     *
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance() {
        /**
         * newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
         */
        //说明:1.ClassLoader: 指定目标对象的类加载器，获取加载器的方法是固定的
        //     2.Class<?>[] interfaces:目标对象实现的接口类型，使用泛型确认类型
        //      3.InvocationHandler: 事件处理,执行目标对象的方法时，会触发事件处理器方法，会把当前执行目标的方法作为参数传入
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理开始");
                //反射机制调用目标方法
                Object returnVal = method.invoke(target, args);
                System.out.println("JDK代理结束");
                return returnVal;
            }
        });
    }
}