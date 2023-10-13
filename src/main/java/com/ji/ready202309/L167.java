package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/09:16
 */
public class L167 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                arr[0] = left + 1;
                arr[1] = right + 1;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return arr;
    }
}
