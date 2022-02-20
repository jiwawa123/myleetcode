package com.ji.algo.L2151_2200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2022/02/20/上午8:50
 */
public class L2161 {
    public static void main(String[] args) {

    }

    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        int tmp = 0;
        for (int t : nums
        ) {
            if (t == pivot) {
                tmp++;
            } else if (t < pivot) {
                l.add(t);
            } else {
                r.add(t);
            }
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < l.size(); i++) {
            res[i] = l.get(i);
        }
        for (int i = l.size(); i < l.size() + tmp; i++) {
            res[i] = pivot;
        }
        for (int i = l.size() + tmp; i < l.size() + tmp + r.size(); i++) {
            res[i] = r.get(i - l.size() - tmp);
        }
        return res;
    }
}
