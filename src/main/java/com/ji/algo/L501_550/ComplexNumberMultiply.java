package com.ji.algo.L501_550;/*
    user ji
    data 2019/7/15
    time 9:28 AM
*/

public class ComplexNumberMultiply {
    public static void main(String[] args) {

    }

    public String complexNumberMultiply(String a, String b) {
        String arr[] = a.split("\\+");
        String arr1[] = b.split("\\+");
        int a1 = Integer.valueOf(arr[0]);
        int a2 = Integer.valueOf(arr[1].replaceAll("i", ""));
        int b1 = Integer.valueOf(arr1[0]);
        int b2 = Integer.valueOf(arr1[1].replaceAll("i", ""));
        int tmp = a1 * b1 - (a2 * b2);
        int tmp1 = a1 * b2 + a2 * b1;
        return "" + tmp + "+" + tmp1 + "i";
    }

}
