package com.ji.baseJava;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * user ji
 * data 2020/8/1
 * time 3:57 下午
 */
public class StringTest {
    public static void main(String[] args) {
        String tmp = new String("xx1");
        System.out.println(tmp);
        change(tmp);
        System.out.println(tmp);
        Lock lock = new ReentrantLock(true);
    }

    public static void change(String tmp) {
        tmp = new String("xxxx");
    }
}
