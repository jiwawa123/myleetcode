package com.ji.algo.L2251_2300;

/**
 * @Author: Bei Chang
 * @Date: 2022/06/02/下午10:40
 */
public class L2287 {
    public static void main(String[] args) {

    }

    public int rearrangeCharacters(String s, String target) {
        int res = Integer.MAX_VALUE;
        int[] arr = new int[26];
        int[] arr1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < target.length(); i++) {
            arr1[target.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != 0) {
                res = Math.min(arr[i] / arr1[i], res);
            }
        }

        return res;
    }
}
