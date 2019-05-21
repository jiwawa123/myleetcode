package com.ji.thread.Thread_Search;/*
    user ji
    data 2019/5/20
    time 6:23 PM
*/

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class SearchTask<T> implements Callable<Integer> {
    private int begin, end;
    private T searchValue;
    private T[] data;
    private AtomicInteger result;

    public SearchTask(int begin, int end, T searchValue, T[] data, AtomicInteger index) {
        this.begin = begin;
        this.end = end;
        this.searchValue = searchValue;
        this.data = data;
        this.result = index;
    }

    @Override
    public Integer call() throws Exception {
        return search(searchValue, begin, end);
    }

    private int search(T searchValue, int begin, int end) {
        int i = 0;
        for (i = begin; i < end; i++) {
            if (data[i].equals(searchValue)) {
                //并发如果其他线程先找到
                if (result.compareAndSet(-1, i)) {
                    System.out.println("修改成功");
                    return result.get();
                } else {
                    System.out.println("修改不成功");
                    return i;
                }
            }
        }
        return -1;
    }
}
