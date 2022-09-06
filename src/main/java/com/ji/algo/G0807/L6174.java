package com.ji.algo.G0807;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/08/07/下午3:07
 */
public class L6174 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 8, 5};
        System.out.println(taskSchedulerII(arr, 2));
    }

    public static long taskSchedulerII(int[] tasks, int space) {
        if (tasks.length == 0) {
            return 0;
        }

        long res = 0;
        Map<Integer, Long> lastMap = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            if (!lastMap.containsKey(tasks[i])) {
                res++;
            } else {
                if (res - lastMap.get(tasks[i]) <= space) {
                    res = lastMap.get(tasks[i]) + space + 1;
                } else {
                    res++;
                }
            }
            lastMap.put(tasks[i], res);
        }
        return res;
    }
}
