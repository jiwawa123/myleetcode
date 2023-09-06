package com.ji.algo.L2801_2850;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/03/15:49
 */
public class L8040 {
    public static void main(String[] args) {

    }

    public int minimumOperations(String num) {
        int res = num.length();
        for (int i = num.length() - 1; i >= 0; i--) {
            int flag = -1;
            if (num.charAt(i) == '0') {
                res = Math.min(res, num.length() - 1);
                flag = 0;
            }
            if (num.charAt(i) == '5') {
                flag = 5;
            }
            if (flag == -1) {
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {
                if ((num.charAt(j) == '0' || num.charAt(j) == '5') && flag == 0) {
                    res = Math.min(res, num.length() - i - 1 + (i - j - 1));
                    continue;
                }

                if ((num.charAt(j) == '2' || num.charAt(j) == '7') && flag == 5) {
                    res = Math.min(res, num.length() - i - 1 + (i - j - 1));
                    continue;
                }
            }
        }

        return res;
    }
}
