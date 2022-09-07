package com.ji.algo.LCP;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/07/上午8:38
 */
public class L006 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int[] arr = {0, 0};
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                arr[0] = i;
                arr[1] = j;
                break;
            }
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return arr;
    }
}
