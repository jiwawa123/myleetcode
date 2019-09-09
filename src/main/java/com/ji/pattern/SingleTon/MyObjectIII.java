package com.ji.pattern.SingleTon;/*
    user ji
    data 2019/9/9
    time 8:39 AM
*/

//double check clock 用来解决懒汉模式的线程不安全的情况
public class MyObjectIII {
    public static void main(String[] args) {

    }

    private MyObjectIII() {

    }

    private static MyObjectIII myObjectIII;

    public static MyObjectIII getIntance() {
        if (myObjectIII == null) {
            synchronized (MyObjectIII.class) {
                if (myObjectIII == null)
                    myObjectIII = new MyObjectIII();
            }
        }

        return myObjectIII;
    }
}
