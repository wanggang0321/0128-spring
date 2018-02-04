package com.ppdtbb.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//媒婆
public class Meipo implements InvocationHandler {

    private Person target;

    //获取被代理人的个人资料
    public Object getInstance(Person target) throws Exception {
        this.target = target;

        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("你的性别是：" + this.target.getSex() + "得给你找个异性才行");
        System.out.println("开始进行海选...");
        this.target.findLove();
        System.out.println("如果合适的话，就准备办事");

        return null;
    }
}
