package com.ji.algo.L2651_2700;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/20/09:37
 */
public class L2678 {
    public static void main(String[] args) {

    }

    public int countSeniors(String[] details) {
        int res = 0;
        for (String detail : details) {
            int age = Integer.valueOf(detail.substring(12, 14));
            if (age > 60) {
                res++;
            }
        }
        return res;
    }
}
