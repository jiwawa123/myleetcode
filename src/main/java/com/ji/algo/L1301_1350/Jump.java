package com.ji.algo.L1301_1350;/*
    user ji
    data 2019/12/30
    time 7:07 PM
*/

public class Jump {
    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 0, 3, 1, 2};
        System.out.println(new Jump().canReach(arr, 5));
    }

    int len = 0;
    boolean flag = false;

    public boolean canReach(int[] arr, int start) {
        len = arr.length;
        boolean left[] = new boolean[len];
        boolean right[] = new boolean[len];
        help(left, right, arr, start);
        return flag;

    }

    public void help(boolean left[], boolean right[], int arr[], int start) {
        if (flag)
            return;
        if (arr[start] == 0) {
            flag = true;
            return;
        }
        if (right[start] != true) {
            right[start] = true;
            if (start + arr[start] < len) {
                help(left, right, arr, start + arr[start]);
            }

        }
        if (left[start] != true) {

            left[start] = true;
            if (start - arr[start] >= 0) {
                help(left, right, arr, start - arr[start]);
            }

        }
    }

}
