package com.ji.pattern.proxy.staticproxy;


/**
 * user ji
 * data 2020/7/19
 * time 12:47 下午
 */
public class Main {
    public static void main(String[] args) {
        T1Proxy proxy = new T1Proxy();
        proxy.myPrint();
    }
}
