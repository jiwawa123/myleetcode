package com.ji.gc;/*
    user ji
    data 2019/5/16
    time 6:35 PM
*/

public class Test {
    private Object instance;

    public Test() {
        //byte[] bytes = new byte[20 * 1024 * 1024];
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.instance = t2;
        t2.instance = t1;

        t1 = null;
        t2 = null;

        System.gc();
    }
}
