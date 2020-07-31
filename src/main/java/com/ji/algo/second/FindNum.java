package com.ji.algo.second;

/**
 * user ji
 * data 2020/7/31
 * time 8:24 上午
 */
public class FindNum {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 1, 2, 3};
        System.out.println(findNum(arr, 1));
    }

    public static int findNum(int arr[], int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int med = (r - l) / 2 + l;
            if (arr[med] == target) {
                return med;
            }
            if (arr[l] <= arr[med]) {
                if (arr[l] <= target && arr[med] > target) {
                    r = med - 1;
                } else {
                    l = med + 1;
                }
            } else {
                if (arr[med] < target && arr[r] >= target) {
                    l = med + 1;
                } else {
                    r = med - 1;
                }
            }
        }
        return -1;
    }
}
