package com.ji.thread.ProductAndConsumer;/*
    user ji
    data 2019/5/22
    time 11:16 AM
*/

public class Test {
    public static void main(String[] args) {
        Product p = new Product();
        Thread produce = new Thread(new Productor(p));
        Thread consumer1 = new Thread(new Consume(p));
        Thread consumer2 = new Thread(new Consume(p));
        produce.start();
        consumer1.start();
        consumer2.start();
    }

}
