package com.ji.algo.L2801_2850;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/03/15:40
 */
public class L7020 {
    public static void main(String[] args) {

    }

    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int i = low; i <= high; i++) {
            String tmp = i + "";
            if (tmp.length() % 2 != 0) {
                continue;
            }
            int l = 0, r = tmp.length() - 1;
            int sl = 0, sr = 0;
            while (l < r) {
                sl += tmp.charAt(l++) - '0';
                sr += tmp.charAt(r--) - '0';
            }
            if (sl == sr) {
                res++;
            }
        }
        return res;
    }
}
