package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/16
    time 8:07 PM
*/

public class MajorityElement {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] arr) {
        int count = 1;
        int re = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (count == 0) {
                re = arr[i];
                count++;
                continue;
            }
            if (re == arr[i])
                count++;
            else
                count--;

        }
        return re;

    }
}
