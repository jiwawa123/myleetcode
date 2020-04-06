package com.ji.algo.G0405;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/4/5
 * time 9:18 PM
 */
public class G2 {
    public static void main(String[] args) {
        System.out.println(countLargestGroup(13));
    }

    public static int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            int count = 0;
            while (tmp > 0) {
                count += tmp % 10;
                tmp /= 10;
            }
            map.put(count, map.getOrDefault(count, 0) + 1);
        }
        int res = 0;
        int tmp = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()
                ) {
            if (tmp == entry.getValue()) {
                res++;
            }
            if (tmp < entry.getValue()) {
                res = 1;
                tmp = entry.getValue();
            }
        }

        return res;
    }
}
