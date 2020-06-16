package com.fly.demo02;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //将真实角色放置进去！
        pih.setTarget(host);
        //动态生成对应的代理类！
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();

    }
}
