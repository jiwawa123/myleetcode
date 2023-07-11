package com.ji.algo.L2701_2750;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/02/13:56
 */
public class L2745 {
    public static void main(String[] args) {
        L2745 l2745 = new L2745();
        long start = System.currentTimeMillis();
        l2745.longestString(10, 10, 10);
        System.out.println(System.currentTimeMillis() - start);
    }

    int max = 0;

    public int longestString(int x, int y, int z) {
        int rs = 0;

        // AA和BB连接，数量大的作为起始
        int AAOrBBCnt = Math.min(x, y);
        if (x == y) {
            rs += 2 * (2 * AAOrBBCnt);
        } else {
            rs += 2 * (2 * AAOrBBCnt + 1);
        }

        // 在AA和BB之间穿插AB
        int ABCnt = Math.min(z, AAOrBBCnt + 1);
        rs += 2 * ABCnt;
        // 末尾拼接剩余AB
        rs += 2 * Math.max(0, z - ABCnt);
        return rs;

    }
}
