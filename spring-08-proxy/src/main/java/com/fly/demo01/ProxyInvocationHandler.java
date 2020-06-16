package com.fly.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }
    //生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }

    // proxy : 代理类 method : 代理类的调用处理程序的方法对象.
    // 处理代理实例上的方法调用并返回结果
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        ask();
        //核心：本质利用反射实现
        Object result = method.invoke(rent);
        fare();
        return result;
    }

    public void ask() {
        System.out.println("咨询中介中...");
    }

    public void fare() {
        System.out.println("支付中介费...");
    }


}
