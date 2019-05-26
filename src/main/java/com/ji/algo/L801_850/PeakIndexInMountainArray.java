package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/26
    time 7:37 PM
*/

public class PeakIndexInMountainArray {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int med = i + (j - i) / 2;
            if (arr[med] > arr[med - 1] && arr[med] > arr[med + 1])
                return med;
            if (arr[med] < arr[med - 1]) {
                j = med - 1;
            }
            if (arr[med] < arr[med + 1]) {
                i = med + 1;
            }
        }
        return i;

    }
}
