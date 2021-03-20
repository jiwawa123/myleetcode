package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/2/22
 * time 9:14 下午
 */
public class L1763 {
    public static void main(String[] args) {

    }

    public String longestNiceSubstring(String s) {
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j >= i; j--) {
                if (isTrue(s.substring(i, j))) {
                    if (s.substring(i, j).length() > tmp.length()) {
                        tmp = s.substring(i, j);
                        break;
                    }
                }
            }
        }

        return tmp;
    }

    public boolean isTrue(String s) {
        if (s.length() < 2)
            return false;
        int arr[] = new int[26];
        int arr1[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'a')
                arr1[s.charAt(i) - 'A'] = 1;
            else
                arr[s.charAt(i) - 'a'] = 1;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != arr1[i])
                return false;
        }
        return true;
    }
}
