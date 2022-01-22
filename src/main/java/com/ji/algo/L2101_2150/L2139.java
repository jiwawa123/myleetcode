package com.ji.algo.L2101_2150;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/22/下午5:36
 */
public class L2139 {
    public static void main(String[] args) {
        System.out.println(minMoves(10, 4));
    }

    public static int minMoves(int target, int maxDoubles) {
        if (target == 1) {
            return 1;
        }

        int count = 0;
        while (maxDoubles > 0 && target > 1) {
            if (target % 2 == 0) {
                target /= 2;

                maxDoubles--;
            } else {
                target--;
            }
            count++;
        }
        count += target - 1;
        return count;


    }
}
