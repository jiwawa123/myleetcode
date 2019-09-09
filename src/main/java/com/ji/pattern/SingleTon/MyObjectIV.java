package com.ji.pattern.SingleTon;/*
    user ji
    data 2019/9/9
    time 8:46 AM
*/

//内置静态变量的形式实现线程安全的创建单例
public class MyObjectIV {
    private MyObjectIV() {
    }

    private static class MyObjectHandler {
        private static MyObjectIV myObjectIV = new MyObjectIV();
    }

    public static MyObjectIV getIntance() {
        return MyObjectHandler.myObjectIV;
    }
}
