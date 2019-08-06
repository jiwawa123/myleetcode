package com.ji.algo.L901_950;/*
    user ji
    data 2019/8/6
    time 9:27 AM
*/

public class LargestTimeFromDigits {
    public static void main(String[] args) {
        LargestTimeFromDigits lt = new LargestTimeFromDigits();
        int arr[] = {1, 2, 3, 4};
        System.out.println(lt.largestTimeFromDigits(arr));
    }

    String string = "";
    int times = 0;

    public String largestTimeFromDigits(int[] A) {
        help(A,0);
        return string;
    }

    public void help(int A[], int index) {
        if (index == A.length) {
            String str = "";
            for (int i = 0; i < A.length; i++) {
                str += A[i];
            }
            System.out.println(str);
            helpII(str);
            return;
        }
        for (int i = index; i < A.length; i++) {
            swap(A, i, index);
            help(A, index + 1);
            swap(A, i, index);
        }
    }

    public static void swap(int arr[], int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public void helpII(String str) {
        int hours = Integer.valueOf(str.substring(0, 2));
        if (hours >= 24)
            return;
        int seconds = Integer.valueOf(str.substring(2, 4));
        if (seconds > 60)
            return;
        int tmp = hours * 60 + seconds;
        if (tmp > times) {
            times = tmp;
            string = hours + ":" + seconds;
            return;
        }
    }
}
