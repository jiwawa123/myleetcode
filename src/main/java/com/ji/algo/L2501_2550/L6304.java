package com.ji.algo.L2501_2550;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/02/05/下午7:00
 */
public class L6304 {
    public static void main(String[] args) {

    }

    public int maxCount(int[] banned, int n, int maxSum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : banned
        ) {
            map.put(t, 1);
        }
        int index = 1, sum = 0, count = 0;
        while (index <= n && sum < maxSum) {
            if(map.containsKey(index)){
                index++;
                continue;
            }
            if (sum + index > maxSum) {
                break;
            }
            sum += index;
            index++;
            count++;
        }
        return count;
    }
}
