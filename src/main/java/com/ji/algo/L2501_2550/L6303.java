package com.ji.algo.L2501_2550;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/02/05/下午6:53
 */
public class L6303 {
    public static void main(String[] args) {

    }

    public int[] separateDigits(int[] nums) {
        List<Integer> list = new LinkedList();
        for (int t : nums) {
            List<Integer> li = new ArrayList<>();
            while (t > 0) {
                li.add(0, t % 10);
                t /= 10;
            }
            for (int k : li
            ) {
                list.add(k);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
