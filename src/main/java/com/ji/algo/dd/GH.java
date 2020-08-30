package com.ji.algo.dd;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/8/21
 * time 8:02 下午
 */
public class GH {
    public static void main(String[] args) {
        List<Long> res = new LinkedList<>();
        res.add(1L);
        res.add(1L);
        for (int i = 2; i < 64; i++) {
            res.add(res.get(i - 1) + res.get(i - 2));
        }
        for (int i = 63; i >= 0; i--) {
            System.out.print(res.get(i) + " ");
            if (i % 8 == 0) {
                System.out.println();
            }
        }
    }
}
