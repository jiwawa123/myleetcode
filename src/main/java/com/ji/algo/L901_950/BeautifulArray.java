package com.ji.algo.L901_950;

import java.util.ArrayList;
import java.util.List;

/**
 * user ji
 * data 2020/4/30
 * time 9:18 上午
 */
public class BeautifulArray {
    public static void main(String[] args) {
        beautifulArray(100);
    }

    public static int[] beautifulArray(int N) {
        List<Integer> res = new ArrayList();
        res.add(1);
        while(res.size() < N) {
            List<Integer> temp = new ArrayList();
            for (Integer a : res) {
                if (a * 2 - 1 <= N) {
                    temp.add(a * 2 - 1);
                }
            }
            for (Integer a : res) {
                if (a * 2 <= N) {
                    temp.add(a * 2);
                }
            }
            res = temp;
        }
        return res.stream().mapToInt(i -> i).toArray();
    }


}
