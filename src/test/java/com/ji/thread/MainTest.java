package com.ji.thread;/*
    user ji
    data 2019/5/20
    time 6:26 PM
*/

import com.ji.thread.Thread_Search.DavideSearch;
import org.junit.Test;

import java.util.Random;
import java.util.UUID;

public class MainTest {
    static final int MAX=100000;
    @Test
    public void integerTest() {
        Integer[] arr = new Integer[MAX];
        Random random = new Random();
        int index = random.nextInt(MAX);
        for (int i = 0; i < MAX; i++) {
            arr[i] = random.nextInt(MAX);
        }
        DavideSearch<Integer> davideSearch = new DavideSearch<>(arr, 3);
        int i = davideSearch.divSearch(arr[index]);
        System.out.print(index + "-------->" + i);
    }

    @Test
    public void StringTest() {
        long start = System.currentTimeMillis();
        String[] arr = new String[MAX];
        Random random = new Random();
        int index = random.nextInt(MAX);
        for (int i = 0; i < MAX; i++) {
            arr[i] = UUID.randomUUID().toString();
        }
        DavideSearch<String> davideSearch = new DavideSearch<>(arr, 3);
        int i = davideSearch.divSearch(arr[index]);
        System.out.println(index + "-------->" + i);
        System.out.println("end"+(System.currentTimeMillis()-start));
    }
    @Test
    public void NoramlSearch() {
        long start = System.currentTimeMillis();
        String[] arr = new String[MAX];
        Random random = new Random();
        int index = random.nextInt(MAX);
        for (int i = 0; i < MAX; i++) {
            arr[i] = UUID.randomUUID().toString();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(arr[index])){
                System.out.println(index + "-------->" + i);
            }
        }
        System.out.println("end"+(System.currentTimeMillis()-start));
    }
}
