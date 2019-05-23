package com.ji.thread.ProductAndConsumer;/*
    user ji
    data 2019/5/22
    time 11:09 AM
*/

public class Consume implements Runnable {
    private Product product;

    public Consume(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        try {
            synchronized (product) {
                while (product.getSize() > 0) {
                    product.consume();
                    System.out.println(Thread.currentThread().getName() + " " + product.consume());
                    product.notify();
                }
                product.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
