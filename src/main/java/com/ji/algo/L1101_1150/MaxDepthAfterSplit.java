package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/8/24
    time 8:57 AM
*/

public class MaxDepthAfterSplit {
    public static void main(String[] args) {
        maxDepthAfterSplit("(()())");
    }

    public static int[] maxDepthAfterSplit(String seq) {
        int res[] = new int[seq.length()];
        int max = 0;
        int count = 0;
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                count += 1;
                max = Math.max(max, count);
            } else {
                count -= 1;
            }
        }
        int A = max / 2;
        for (int i = 0; i < res.length; i++) {
            if (seq.charAt(i) == '(') {
                count += 1;
                if (count > A) {
                    res[i] = 1;
                }
            } else {

                if (count > A)
                    res[i] = 1;
                count -= 1;
            }
        }
        return res;
    }
}
