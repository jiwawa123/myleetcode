package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/5/21
    time 7:05 PM
*/

public class BitwiseComplement {
    public static void main(String[] args) {

    }

    public int bitwiseComplement(int N) {
        if (N == 0)
            return 0;
        int count = 0;
        int index = 0;
        while (N > 0) {
            if (N % 2 == 0) {
                count += Math.pow(2, index);
            }
            N /= 2;
            index++;
        }
        return count;
    }
}
