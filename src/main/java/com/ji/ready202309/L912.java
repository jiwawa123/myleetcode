package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/07/22:18
 */
public class L912 {

    public static void main(String[] args) {
        int[] arr = {3, 5, 0, 1, 4, 7};
        new L912().quickSort(0, arr.length - 1, arr);
        for (int n:arr
             ) {
            System.out.println(n);
        }
    }


    public void quickSort(int start, int end, int[] arr) {
        if (start < end) {
            int med = partition(start, end, arr);
            quickSort(start, med - 1, arr);
            quickSort(med + 1, end, arr);
        }
    }

    public int partition(int start, int end, int[] arr) {
        int left = start, right = end;
        int med = arr[start];
        while (left < right) {
            while (left < right && arr[right] >= med) {
                right--;
            }
            if (left < right) {
                arr[left] = arr[right];
                left++;
            }
            while (left < right && arr[left] < med) {
                left++;
            }
            if (left < right) {
                arr[right] = arr[left];
                right--;
            }
        }
        arr[left] = med;
        return left;
    }
}
