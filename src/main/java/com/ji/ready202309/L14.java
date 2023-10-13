package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/09:05
 */
public class L14 {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        String tmp = "";
        int len = 2000;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < len) {
                tmp = strs[i];
                len = tmp.length();
            }
        }
        for (int i = 0; i < tmp.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != tmp.charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                return tmp.substring(0, i);
            }
        }
        return "";
    }
}
