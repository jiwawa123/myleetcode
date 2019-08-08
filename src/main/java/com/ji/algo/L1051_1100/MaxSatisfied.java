package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/8/8
    time 11:23 AM
*/

public class MaxSatisfied {
    public static void main(String[] args) {

        int arr1[] = {1, 0, 1, 2, 1, 1, 7, 5};
        int arr2[] = {0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println(maxSatisfied(arr1, arr2, 3));
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int all = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                all += customers[i];
            }
        }
        if (X == 0)
            return all;
        int max = all;
        int tmp = all;
        for (int i = 0; i < X && i < customers.length; i++) {
            if (grumpy[i] == 1) {
                tmp += customers[i];
            }
        }
        max = Math.max(max, tmp);
        for (int i = X; i < customers.length; i++) {
            if (grumpy[i - X] == 1) {
                tmp -= customers[i - X];
            }
            if (grumpy[i] == 1) {
                tmp += customers[i];
            }
            max = Math.max(max, tmp);
        }
        return max;
    }
}
