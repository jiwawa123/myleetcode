package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/14
    time 5:39 PM
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumFriendRequests {
    public static void main(String[] args) {
        int arr[] = {16, 16};
        System.out.println(numFriendRequests(arr));
    }

    public static int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int count = 0;
        for (int i = 0; i < ages.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (ages[i] > 100 && ages[j] < 100)
                    break;
                if (ages[i] > ages[j] * 0.5 + 7) {
                    count++;
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < ages.length; j++) {
                if (ages[i] == ages[j])
                    count++;
            }
        }
        return count;
    }
}
