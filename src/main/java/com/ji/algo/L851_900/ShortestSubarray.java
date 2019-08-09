package com.ji.algo.L851_900;/*
    user ji
    data 2019/8/6
    time 5:53 PM
*/

public class ShortestSubarray {
    public static void main(String[] args) {
        int arr[] = {2, -1, 2, 1, 3};
        System.out.println(new ShortestSubarray().shortestSubarray(arr, 3));
    }

    public int shortestSubarray(int[] A, int K) {
        int len = A.length;
        int sum = 0, begin = 0, res = -1;
        for (int i = 0; i < len; i++) {
            if (A[i] >= K) return 1;
            sum += A[i];
            if (sum < 1) {
                sum = 0;
                begin = i + 1;
                continue;
            }
            for (int j = i - 1; A[j + 1] < 0; j--) {
                A[j] = A[j + 1] + A[j];
                A[j + 1] = 0;
            }
            if (sum >= K) {
                while (sum - A[begin] >= K || A[begin] <= 0)
                    sum -= A[begin++];
                int length = i - begin + 1;
                if (res < 0 || res > length)
                    res = length;
            }
        }
        return res;
    }

    public boolean isExist(int[] A, int K) {
        int count = Integer.MIN_VALUE;
        int max = count;
        for (int i = 0; i < A.length; i++) {
            if (count < 0) {
                count = A[i];
            } else {
                count += A[i];
            }
            max = Math.max(count, max);
        }
        return max >= K;
    }
}
