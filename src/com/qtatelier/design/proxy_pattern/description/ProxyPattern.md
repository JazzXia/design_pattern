# 代理模式
## 静态代理
   静态代理在使用时，需要定义接口或者父类,被代理对象(即目标对象)与代理对象一起实现相同的接口或者继承相同的父类
   代理模式的用处就是将重要的功能单独实现，将重复的功能放在一个地方共同来实现
   比如说：如果需要验证某个数据的完整性或者校验数据是否合法，就可以使用代理模式，功能性都在单独实现，而代理是实现了
   对数据进行校验
#### 优点
    在不修改目标对象的功能前提下，能通过代理对象对目标功能扩展
#### 缺点
    1.因为代理对象需要与目标对象实现一样的接口，所以会有很多代理类
    2.一旦接口增加方法,目标对象与代理对象都要维护
    
## 动态代理
   1.代理对象不需要实现接口，但是目标对象要实现接口，否则不能用动态代理
   2.代理对象的生成，是利用JDK的API 动态地在内存中构建代理对象
   3.动态代理也叫做：JDK代理、接口代理