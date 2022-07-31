package com.ji.algo.L2251_2300;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/31/上午9:57
 */
public class L2279 {
    public static void main(String[] args) {
        int[] cap = {2, 3, 4, 5};
        int[] add = {1, 2, 4, 4};
        maximumBags(cap, add, 2);
    }

    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] - rocks[i] > 0) {
                list.add(capacity[i] - rocks[i]);
            }
        }
        Collections.sort(list);
        int count = 0;
        for (int t : list
        ) {
            if (t > additionalRocks || additionalRocks <= 0) {
                break;
            }
            if (t <= 0) {
                count++;
                continue;
            }
            if (t <= additionalRocks) {
                count++;
                additionalRocks -= t;
            }
        }
        return count;
    }
}
