package com.ji.thread.Thread_Search;/*
    user ji
    data 2019/5/20
    time 5:21 PM
*/

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DavideSearch<T> {
    private T[] data;

    private int divCount;
    //统一操作的标识符
    private AtomicInteger index;

    public DavideSearch(T[] data, int divCount) {
        this.data = data;
        this.divCount = divCount;
        index = new AtomicInteger(-1);
    }

    static ExecutorService service = new ThreadPoolExecutor(0, 10,
            60, TimeUnit.SECONDS, new SynchronousQueue<>(), new ThreadFactory() {
        AtomicInteger integer = new AtomicInteger();
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "search-thread" + integer);
        }
    });

    public <T> int divSearch(T searchValue) {
        int subSize = data.length / divCount;
        for (int i = 0; i < data.length; i += subSize) {
            int end = i + subSize;
            if (end > data.length) {
                end = data.length;
            }
            SearchTask<T> searchTask = new SearchTask<>(i, end, searchValue, (T[]) data, index);
            Future<Integer> submit = service.submit(searchTask);
        }
        return index.get();
    }
}
