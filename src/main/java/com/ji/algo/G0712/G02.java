package com.ji.algo.G0712;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/7/12
 * time 12:15 下午
 */
public class G02 {
    public static void main(String[] args) {

    }

    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = nums[i];
            res.add(count);
            for (int j = i + 1; j < nums.length; j++) {
                count += nums[j];
                res.add(count);
            }
        }
        Collections.sort(res);
        int tmp = 0;
        for (int i = left - 1; i < right; i++) {
            tmp += res.get(i);
        }
        return tmp;
    }
}
