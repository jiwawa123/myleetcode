package com.ji.algo.L1651_1700;

/**
 * user ji
 * data 2020/12/16
 * time 8:43 下午
 */
public class L1684 {
    public static void main(String[] args) {

    }

    public int countConsistentStrings(String allowed, String[] words) {
        int arr[] = new int[26];
        for (char a : allowed.toCharArray()) {
            arr[a - 'a'] += 1;
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            int len = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (arr[words[i].charAt(j) - 'a'] < 1) {
                    break;
                }
                len++;
            }
            count += len == words[i].length() ? 1 : 0;
        }
        return count;
    }
}
