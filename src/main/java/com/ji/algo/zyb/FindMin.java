package com.ji.algo.zyb;

/**
 * user ji
 * data 2020/8/8
 * time 4:41 下午
 */
public class FindMin {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 0};
        System.out.println(findMin(arr));
    }

    public static int findMin(int arr[]) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int med = (r - l) / 2 + l;
            if (arr[med] <= arr[r]) {
                r = med;
                continue;
            }
            if (arr[med] > arr[r]) {
                l = med + 1;
            }


        }
        return arr[l];
    }
}
