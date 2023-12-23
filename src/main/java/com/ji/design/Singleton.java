package com.ji.design;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/14/18:25
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }
}
