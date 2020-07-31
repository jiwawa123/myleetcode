package com.ji.pattern.SingleTon;

/**
 * user ji
 * data 2020/7/31
 * time 9:20 上午
 */
public class SingletonDemo {
    // 可以使用volatile 确保不发生指令重排
    private static volatile SingletonDemo demo = null;

    private SingletonDemo() {
        System.out.println(Thread.currentThread().getName() + "========");
    }


    // double check 枷锁之前和之后都进行一次判断，可以降低锁的力度
    public static SingletonDemo getInstance() {
        if (demo == null) {
            synchronized (SingletonDemo.class) {
                if (demo == null)
                    demo = new SingletonDemo();
            }
        }
        return demo;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            new Thread(() -> {
                SingletonDemo.getInstance();
            }).start();
        }
    }
}
