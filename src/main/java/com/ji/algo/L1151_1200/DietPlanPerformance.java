package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/9/2
    time 9:51 AM
*/

public class DietPlanPerformance {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(dietPlanPerformance(arr, 1, 3, 3));
    }

    public static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        if (calories == null || calories.length == 0)
            return 0;
        int arr[] = new int[calories.length + 1];
        arr[0] = 0;
        //计算前缀和即可
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1] + calories[i - 1];
        }
        int count = 0;
        for (int i = arr.length - 1; i >= 0 && i - k >= 0; i--) {
            int tmp = arr[i] - arr[i - k];
            if (tmp < lower)
                count--;
            if (tmp > upper)
                count++;
        }
        return count;
    }
}
