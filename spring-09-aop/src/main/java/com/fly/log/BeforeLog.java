package com.fly.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    //method : 要执行的目标对象的方法
    //objects : 被调用的方法的参数
    //Object : 目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + target.getClass().getName() + "的" + method.getName() + "方法");
    }
}
