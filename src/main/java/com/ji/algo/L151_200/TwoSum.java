package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/16
    time 4:52 PM
*/

public class TwoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int arr[] = {-1, -1};
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (target == numbers[i] + numbers[j]) {
                arr[0] = i;
                arr[1] = j;
                break;
            } else if (target < numbers[i] + numbers[j]) {
                j--;
            } else {
                i++;
            }
        }
        return arr;
    }
}
