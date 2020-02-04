package com.qtatelier.design.proxy_pattern.dynmic_proxy;

/**
 * @author xiaweiwei
 * @descrpition 静态代理模式【通过JOJO来模拟】
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-04 11:52
 */
public interface IJOJO {
    //可以打架
    void hit();
    //可以玩
    void play();
    //会受伤
    void injured();
    //可以暂停时间
    void stopWorld();
    void beat(String name);
}
