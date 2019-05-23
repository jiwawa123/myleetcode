package com.ji.thread.ProductAndConsumer;/*
    user ji
    data 2019/5/22
    time 11:06 AM
*/

public class Productor implements Runnable {
    private Product product;

    public Productor(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                synchronized (product) {
                    while (product.getSize() == 100) {
                        product.wait();
                    }
                    product.add(i + "");
                    System.out.println("add " + i);
                    product.notify();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
