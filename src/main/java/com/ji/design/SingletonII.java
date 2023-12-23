package com.ji.design;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/15/10:00
 */
public class SingletonII {
    public static void main(String[] args) {

    }

    private static volatile SingletonII instance;

    private SingletonII() {

    }

    public static SingletonII getInstance() {
        if (instance == null) {
            synchronized (SingletonII.class) {
                if (instance == null) {
                    instance = new SingletonII();
                }
            }
        }
        return instance;
    }

}
