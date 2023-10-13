package com.ji.base;/*
    user ji
    data 2019/6/14
    time 9:08 PM
*/

public class Temp {
    public static void main(String[] args) {
        System.out.println(hammingWeight("00000000000000000000000000001011"));
        final Temp temp = new Temp();
        temp.k = 1203;
    }

    public static int hammingWeight(String n) {

        String tmp = "" + n;
        int count = 0;
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == '1')
                count++;
        }
        return count;
    }

    private int k;
}
