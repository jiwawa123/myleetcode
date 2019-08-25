package com.ji.algo.L901_950;/*
    user ji
    data 2019/8/25
    time 11:13 AM
*/

import java.util.Arrays;

public class BagOfTokensScore {
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        System.out.println(bagOfTokensScore(arr, 200));
    }

    public static int bagOfTokensScore(int[] tokens, int P) {
        int max = 0;
        int tmp = 0;
        Arrays.sort(tokens);
        int i = 0, j = tokens.length - 1;
        while (i <= j) {
            if (P < tokens[i]) {
                if (tmp == 0) {
                    break;
                } else {
                    tmp -= 1;
                    P += tokens[j--];
                }
            } else {
                tmp++;
                max = Math.max(tmp, max);
                P -= tokens[i++];
            }
        }
        return max;
    }
}
