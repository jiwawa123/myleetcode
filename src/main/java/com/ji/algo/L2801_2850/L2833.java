package com.ji.algo.L2801_2850;

/**
 * @Author: Bei Chang
 * @Date: 2023/08/30/08:38
 */
public class L2833 {
    public static void main(String[] args) {
        furthestDistanceFromOrigin("L_RL__R");
    }

    public static int furthestDistanceFromOrigin(String moves) {
        int l = 0, r = 0, n = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    l++;
                    break;
                case 'R':
                    r++;
                    break;
                default:
                    n++;
                    break;
            }
        }
        return Math.abs(l - r) + n;
    }
}
