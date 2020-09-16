package com.ji.algo.G0907;

import java.util.Arrays;

/**
 * user ji
 * data 2020/9/7
 * time 8:20 上午
 */
public class G {
    public static void main(String[] args) {
        System.out.println(modifyString("?za"));
    }

    public static String modifyString(String s) {
        int arr[] = new int[26];
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                Arrays.fill(arr, 0);
                if (i > 0) {
                    arr[sp.charAt(i - 1) - 'a'] = 1;
                }
                if (i < s.length() - 1 && s.charAt(i + 1) != '?') {
                    arr[s.charAt(i + 1) - 'a'] = 1;
                }
                for (int j = 0; j < 26; j++) {
                    if (arr[j] == 0) {
                        sp.append((char) (j + 'a'));
                        break;
                    }
                }
            } else {
                sp.append(s.charAt(i));
            }
        }

        return sp.toString();
    }
}
