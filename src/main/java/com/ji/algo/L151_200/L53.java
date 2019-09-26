package com.ji.algo.L151_200;/*
    user ji
    data 2019/9/26
    time 9:59 AM
*/

public class L53 {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(getMin(arr));
    }

    public static int getMin(int arr[]) {
        if (arr.length == 1)
            return arr[0];
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int med = (j - i) / 2 + i;
            int l = Math.max(i, med - 1);
            int r = Math.min(med + 1, j);
            if (arr[med] <= arr[l] && arr[med] <= arr[r])
                return arr[med];
            if (arr[i] < arr[med]) {
                if (arr[i] > arr[j]) {
                    i = med + 1;
                    continue;
                }
            }
            if (arr[med] > arr[l]) {
                j = med - 1;
                continue;
            }
            if (arr[med] > arr[r]) {
                i = med + 1;
                continue;
            }
        }

        return arr[0];
    }
}
