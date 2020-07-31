package com.ji.algo.second;

/**
 * user ji
 * data 2020/7/31
 * time 8:52 上午
 */
public class MinArray {

    public static void main(String[] args) {
        int arr[] = {1, 3, 3};
        System.out.println(getMin(arr));
    }

    // 寻找旋转数组中最小的数字
    public static int getMin(int arr[]) {
        if (arr.length == 0)
            return arr[0];
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int med = (r - l) / 2 + l;
            if (arr[med] < arr[r]) { //
                r = med;
            } else if (arr[med] > arr[r]) {
                l = med + 1;
            } else {
                r--;
            }
        }
        return arr[l];
    }
}
