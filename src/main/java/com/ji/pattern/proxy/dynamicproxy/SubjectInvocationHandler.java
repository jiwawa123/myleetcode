package com.ji.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * user ji
 * data 2020/7/19
 * time 1:38 下午
 */
public class SubjectInvocationHandler implements InvocationHandler {
    //代理类持有一个委托类的对象引用
    private Object delegate;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        checkPopedom();
        long stime = System.currentTimeMillis();
        method.invoke(delegate, args);
        long ftime = System.currentTimeMillis();
        System.out.println("执行任务耗时" + (ftime - stime) + "毫秒");
        return null;
    }

    public Object newProxyInstance(Object targetObject) {
        this.delegate = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), this);
    }

    /**
     * 模拟检查权限的例子
     */
    private void checkPopedom() {
        System.out.println("======检查权限checkPopedom()======");
    }

}
