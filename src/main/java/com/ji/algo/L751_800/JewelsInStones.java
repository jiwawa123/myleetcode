package com.ji.algo.L751_800;/*
    user ji
    data 2019/5/12
    time 8:35 AM
*/

public class JewelsInStones {
    public static void main(String[] args) {
        System.out.println((int) ('z' - 'A'));
    }

    public int numJewelsInStones(String J, String S) {
        int arr[] = new int[57];
        for (int i = 0; i < J.length(); i++) {
            arr[J.charAt(i) - 'A'] += 1;
        }
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            count += arr[S.charAt(i) - 'A'];
        }
        return count;
    }
}
