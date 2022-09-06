package com.ji.algo.L2351_2400;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/06/上午8:51
 */
public class L2399 {
    public static void main(String[] args) {

    }

    public boolean checkDistances(String s, int[] distance) {
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (arr[index] != -1) {
                if (i - 1 - arr[index] != distance[index]) {
                    return false;
                }
            }
            arr[index] = i;
        }


        return true;
    }
}
