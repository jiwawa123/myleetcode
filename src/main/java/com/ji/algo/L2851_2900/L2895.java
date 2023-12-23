package com.ji.algo.L2851_2900;

import java.util.Collections;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/14/18:14
 */
public class L2895 {
    public static void main(String[] args) {

    }

    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int res = Integer.MIN_VALUE;
        Collections.sort(processorTime);
        Collections.sort(tasks);
        int len = 0, left = 0, right = tasks.size() - 1;
        while (right >= 0) {
            int p = tasks.get(right--);
            if (len == 4) {
                len %= 4;
                left++;
            }
            res = Math.max(res, p + processorTime.get(left));
            len++;
        }
        return res;
    }
}
