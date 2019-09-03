package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/9/3
    time 10:47 AM
*/

public class MajorityElement {
    public static void main(String[] args) {

    }

    public boolean isMajorityElement(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target)
                break;
            if (arr[i] == target)
                count++;
            if (count > arr.length / 2)
                return true;
        }
        return count > arr.length / 2;
    }
}
