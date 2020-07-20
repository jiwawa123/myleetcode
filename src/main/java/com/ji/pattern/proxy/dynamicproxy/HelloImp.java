package com.ji.pattern.proxy.dynamicproxy;

/**
 * user ji
 * data 2020/7/19
 * time 1:43 下午
 */
public class HelloImp implements Hello {
    @Override
    public void help() {
        System.out.println("======hello=======");
    }
}
