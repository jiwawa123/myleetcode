package com.ji.algo.G0201;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2021/2/1
 * time 10:02 上午
 */
public class L5654 {
    public static void main(String[] args) {

    }

    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int tmp = findWhere(i);
            int numbers = map.getOrDefault(tmp, 0) + 1;
            map.put(tmp, numbers);
            res = Math.max(res, numbers);
        }

        return res;
    }

    public int findWhere(int limit) {
        int count = 0;
        while (limit > 0) {
            count += limit % 10;
            limit /= 10;
        }
        return count;
    }
}
