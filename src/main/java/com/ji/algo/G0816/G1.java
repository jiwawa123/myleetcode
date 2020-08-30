package com.ji.algo.G0816;

import java.util.Arrays;

/**
 * user ji
 * data 2020/8/16
 * time 4:07 下午
 */
public class G1 {
    public static void main(String[] args) {
        int arr[] = {79, 74, 57, 22};
        System.out.println(maxDistance(arr, 4));
    }

    // 使用二分查找
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int max = position[position.length - 1] - position[0];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < position.length; i++) {
            min = Math.min(position[i] - position[i - 1], min);
        }
        int l = min, r = max;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (isMatch(position, mid, m)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return Math.min(r, l);
    }

    public static boolean isMatch(int arr[], int mid, int m) {
        int tmp = arr[0];
        int len = 1;
        for (int i = 1; i < arr.length; i++) {
            if (tmp + mid <= arr[i]) {
                len++;
                tmp = arr[i];
            }
            if (len >= m) {
                return true;
            }
        }
        return len >= m;
    }
}
