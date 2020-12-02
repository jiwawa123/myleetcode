package com.ji.tx1125;

/**
 * user ji
 * data 2020/11/25
 * time 7:48 下午
 */
public class G {
    public static void main(String[] args) {

    }

    public String sortString(String s) {
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }
        StringBuilder sp = new StringBuilder();
        boolean flag = true;
        int tmp = 0;
        while (sp.length() < s.length()) {
            if (flag) {
                for (int i = 0; i < 26; i++) {
                    if (arr[i] != 0) {
                        sp.append((char) ('a' + i));
                        arr[i]--;
                    }
                }
                flag = false;
                tmp = 26;
            } else {
                for (int i = tmp - 1; i >= 0; i--) {
                    if (arr[i] != 0) {
                        sp.append((char) ('a' + i));
                        arr[i]--;
                    }
                }
                flag = true;
                tmp = 0;
            }
        }


        return sp.toString();
    }
}
