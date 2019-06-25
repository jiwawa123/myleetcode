package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/6/25
    time 6:08 PM
*/

public class MoveStone {
    public static void main(String[] args) {

    }

    public int[] numMovesStones(int a, int b, int c) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        int max = Math.max(a, b);
        max = Math.max(max, c);
        int med = a + b + c - min - max;
        int arr[] = new int[2];
        if (min + 1 == med && med + 1 == max)
            return arr;
        if (min + 1 == med || med + 1 == max || max - med == 2)
            arr[0] = 1;
        arr[1] = max - (min + 2) + med - (min + 1);
        return arr;
    }
}
