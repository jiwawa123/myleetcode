package com.ji.algo.L801_850;/*
    user ji
    data 2019/6/29
    time 4:57 PM
*/

import java.util.Arrays;

public class IsNStraightHand {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        System.out.println(isNStraightHand(arr, 3));
    }

    public static boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0)
            return false;
        Arrays.sort(hand);
        boolean flag[] = new boolean[hand.length];
        int count = 0;
        int group = hand.length / W;
        int len = 0;
        int max = -1;
        while (count < group) {
            for (int i = 0; i < hand.length; i++) {
                if (len == W)
                    break;
                if (flag[i])
                    continue;
                if (max == -1) {
                    max = hand[i];
                    len++;
                    flag[i] = true;
                    continue;
                }
                if (max == hand[i] - 1) {
                    max++;
                    len++;
                    flag[i] = true;
                }
            }
            if (len == W) {
                len = 0;
                max = -1;
                count++;
            } else {
                return false;
            }

        }
        return count == group;
    }
}
