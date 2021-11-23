package com.ji.algo.L2001_2050;

/**
 * @author ji
 * @data 2021/10/16
 * @time 11:01 下午
 */
public class L2027 {
    public static void main(String[] args) {

    }

    public int minimumMoves(String s) {
        int count = 0;
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'O') {
                if (len != 0) {
                    len++;
                }
            } else {
                len++;
            }

            if (len == 3) {
                count++;
                len = 0;
            }
        }
        if (len != 0) {
            count++;
        }
        return count;
    }
}
