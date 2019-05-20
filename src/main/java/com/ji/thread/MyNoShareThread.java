package com.ji.thread;/*
    user ji
    data 2019/5/20
    time 4:28 PM
*/

/*
数据共享的情况
 */

public class MyNoShareThread extends Thread {
    int count = 10;

    public MyNoShareThread(String name) {
        super();
        this.setName(name);
    }

    public void run() {
        super.run();
        while (count >= 0) {
            System.out.println(Thread.currentThread().getName() + " is doing " + count--);
        }
    }
}
