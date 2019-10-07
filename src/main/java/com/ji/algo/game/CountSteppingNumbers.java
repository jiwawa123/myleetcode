package com.ji.algo.game;/*
    user ji
    data 2019/10/7
    time 9:55 AM
*/

import java.util.*;

public class CountSteppingNumbers {
    public static void main(String[] args) {
        List l = countSteppingNumbers(709852790, 1686392249);
        l.stream().forEach(System.out::println);
    }

    public static List<Integer> countSteppingNumbers(int low, int high) {
        Set<Integer> li = new HashSet<>();
        Map<Integer, Set<Long>> map = new HashMap<>();
        map.put(0, new HashSet<>());
        for (int i = 0; i < 10; i++) {
            map.get(0).add(i*1L);
            if (i >= low && i <= high) {
                li.add(i);
            }
        }
        for (int i = 1; i <= 20; i++) {
            if (i > (high + "").length()) {
                break;
            }
            Set<Long> l = map.get(i - 1);
            map.put(i, new HashSet<>());
            for (long k:l) {
                if (k < (int) Math.pow(10, i - 1) - 1)
                    continue;
                //开始在头部插入
                long head = k / (int) Math.pow(10, i - 1);
                long fail = k % 10;
                if (head > 1) {
                    long t = (long) Math.pow(10, i) * (head - 1) + k;
                    if(t==710857255){
                        System.out.println("=========");
                    }
                    if (t >= low && t <= high) {
                        li.add((int) t);
                    }
                    map.get(i).add(t);
                }
                if (head < 9) {
                    long t = (long) Math.pow(10, i) * (head + 1) + k;
                    if(t==710857255){
                        System.out.println("=========");
                    }
                    if (t >= low && t <= high) {
                        li.add((int) t);

                    }
                    map.get(i).add(t);
                }
                if (fail > 0) {
                    long t = k * 10 + fail - 1;
                    if(t==710857255){
                        System.out.println("=========");
                    }
                    if (t >= low && t <= high) {
                        li.add( (int)t);

                    }
                    map.get(i).add( t);
                }
                if (fail < 9) {
                    long t = k * 10 + fail + 1;
                    if(t==710857255){
                        System.out.println("=========");
                    }
                    if (t >= low && t <= high) {
                        li.add((int) t);
                    }
                    map.get(i).add(t);
                }

            }
        }
        List<Integer> res = new ArrayList<>(li);
        Collections.sort(res);
        return res;
    }

}
