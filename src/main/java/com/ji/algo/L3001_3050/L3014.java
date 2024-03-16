package com.ji.algo.L3001_3050;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/09/22:16
 */
public class L3014 {

    public int minimumPushes(String word) {

        int res = 0;
        int len = 0, index = 1;
        while (len > 0) {
            int t = Math.min(len, 9);
            res += t * index;
            index++;
            len = Math.max(0, len - 9);
        }


        return res;
    }
}
