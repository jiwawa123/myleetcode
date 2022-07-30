package com.ji.algo.L2301_2350;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/24/下午4:22
 */
public class L6128 {
    public static void main(String[] args) {

    }

    public String bestHand(int[] ranks, char[] suits) {
        int[] arr = new int[4];
        int res = 0;
        for (int i = 0; i < suits.length; i++) {
            arr[suits[i] - 'a']++;
            res = Math.min(arr[suits[i] - 'a'], res);
        }
        if (res == 5) {
            return "Flush";
        }
        int[] cards = new int[14];
        int max = 0;
        for (int rank : ranks
        ) {
            cards[rank]++;
            max = Math.max(max, cards[rank]);

        }
        if (max >= 3) {

            return "Three of a Kind";
        }

        if (max == 2) {
            return "Pair";
        }
        return "High Card";

    }
}
