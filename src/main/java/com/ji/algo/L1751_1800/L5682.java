package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/3/7
 * time 10:24 下午
 */
public class L5682 {
    public static void main(String[] args) {
        System.out.println(beautySum("aabcbaa"));
    }

    public static int beautySum(String s) {
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            int arr[] = new int[26];
            arr[s.charAt(i) - 'a'] += 1;
            for (int j = i + 1; j < s.length(); j++) {
                arr[s.charAt(j) - 'a'] += 1;
                int max = 0, min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    max = Math.max(max, arr[k]);
                    if (arr[k] != 0) {
                        min = Math.min(min, arr[k]);
                    }
                }
                tmp += max - min;
            }
        }
        return tmp;
    }
}
