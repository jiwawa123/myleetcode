package com.ji.algo.G0426;

/**
 * user ji
 * data 2020/4/27
 * time 8:36 上午
 */
public class L2 {
    public static void main(String[] args) {
        int arr[] = {100, 40, 17, 9, 73, 75};
        System.out.println(maxScore(arr, 3));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int l[] = new int[k];
        int r[] = new int[k];
        for (int i = 0; i < k; i++) {
            l[i] = i == 0 ? cardPoints[0] : cardPoints[i] + l[i - 1];
        }
        for (int i = 0; i < k; i++) {
            r[i] = i == 0 ? cardPoints[cardPoints.length - 1] : r[i - 1] + cardPoints[cardPoints.length - i - 1];
        }
        int res = Math.max(l[k - 1], r[k - 1]);
        if (k == cardPoints.length)
            return res;
        for (int i = 0; i < k - 1; i++) {
            res = Math.max(res, l[i] + r[k - 2 - i]);
        }
        return res;
    }
}
