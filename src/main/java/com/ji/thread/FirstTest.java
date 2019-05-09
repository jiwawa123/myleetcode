package com.ji.thread;/*
    user ji
    data 2019/5/8
    time 8:24 PM
*/

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FirstTest {
    public static void main(String[] args) {
//        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 5,
//                60, TimeUnit.MICROSECONDS, queue);
        ExecutorService pool = Executors.newFixedThreadPool(50);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50000; i++) {
            list.add(i);
        }
        long a = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("sum " + sum);
        System.out.println("串行计算" + (System.currentTimeMillis() - a));
        List<List<Integer>> all = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 1000) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = i; j < i + 1000 && j < list.size(); j++) {
                tmp.add(list.get(j));
            }
            all.add(tmp);
        }
        System.out.println(all.size());
        long b = System.currentTimeMillis();
        List<CustomTask> result = new ArrayList<>();
        for (int i = 0; i < all.size(); i++) {
            CustomTask task = new CustomTask(i, all.get(i));
            pool.execute(task);
            result.add(task);
        }
        pool.shutdown();
        int sum1 = 0;
        while (true) {//等待所有任务都执行结束
            if (pool.isTerminated()) {//所有的子线程都结束了
                break;
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(i+"  "+result.get(i).getSum());
            sum1 += result.get(i).getSum();
        }
        System.out.println("sum1 " + sum1);
        System.out.println(System.currentTimeMillis() - b);
    }
}
