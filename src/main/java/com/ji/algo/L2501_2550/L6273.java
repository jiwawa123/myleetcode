package com.ji.algo.L2501_2550;

/**
 * @Author: Bei Chang
 * @Date: 2022/12/25/下午5:13
 */
public class L6273 {
    public static void main(String[] args) {
        int[] res = {0, 0, 1, -1};
        System.out.println(captureForts(res));
    }

    public static int captureForts(int[] forts) {
        int res = 0;
        boolean f = false;
        int index = -1;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1) {
                index = i;
            } else if (forts[i] == -1) {
                if (index != -1) {
                    res = Math.max(res, i - index - 1);
                    index = -1;
                }
            }
        }
        index = -1;
        for (int i = forts.length - 1; i >= 0; i--) {
            if (forts[i] == 1) {
                index = i;
            } else if (forts[i] == -1) {
                if (index != -1) {
                    res = Math.max(res, index - i - 1);
                    index = -1;
                }
            }
        }

        return res;
    }
}
