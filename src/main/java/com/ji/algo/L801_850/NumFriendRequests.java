package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/14
    time 5:39 PM
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumFriendRequests {
    public static void main(String[] args) {
        int arr[] = new int[2];
        System.out.println(numFriendRequests(arr));
    }

    public static int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ages.length; i++) {
            if (map.containsKey(ages[i])) {
                count += map.get(ages[i]);
                continue;
            }
            int tmp = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (ages[j] > ages[i] * 0.5 + 7) {
                    tmp++;
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < ages.length; j++) {
                if (ages[j] == ages[i] && ages[i] > 0.5 * ages[i] + 7)
                    tmp++;
                else
                    break;
            }
            map.put(ages[i], tmp);
            count += tmp;
        }
        return count;
    }
}
