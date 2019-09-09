package com.ji.pattern.SingleTon;/*
    user ji
    data 2019/9/9
    time 8:34 AM
*/

public class TestSingleTon {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                System.out.println(MyObjectVI.getInstance());
            });
            thread.start();
        }
    }
}
