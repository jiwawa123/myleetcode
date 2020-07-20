package com.ji.pattern.proxy.staticproxy;

import com.ji.pattern.proxy.staticproxy.T1;
import com.ji.pattern.proxy.staticproxy.T1Imp;

/**
 * user ji
 * data 2020/7/19
 * time 12:45 下午
 */
public class T1Proxy implements T1 {
    T1 t1 = new T1Imp();
    @Override
    public void myPrint() {
        System.out.println("before");
        t1.myPrint();
        System.out.println("after");
    }
}
