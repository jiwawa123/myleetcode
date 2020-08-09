package com.ji.algo.G0808;

/**
 * user ji
 * data 2020/8/8
 * time 10:49 下午
 */
public class G1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(findKthPositive(arr, 1));
    }

    public static int findKthPositive(int[] arr, int k) {
        int first = 1;
        int j = 0;
        for (int i = 0; i < arr.length && j < k; ) {
            if (arr[i] == first) {
                first++;
                i++;
                continue;
            }
            if (arr[i] > first) {
                j++;
                first++;
            }
        }

        while (j < k) {
            first++;
            j++;
        }
        return first - 1;
    }
}
