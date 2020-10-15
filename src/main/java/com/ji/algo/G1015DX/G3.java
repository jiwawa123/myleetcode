package com.ji.algo.G1015DX;

import java.util.Scanner;

public class G3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        System.out.println(longestCommonPrefix(tmp.split(",")));
    }

    public static String longestCommonPrefix(String[] strs) {
        // 边界判断
        if (strs == null || strs.length == 0)
            return "";
        String min = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min.length()) {
                min = strs[i];
            }
        }
        for (int i = min.length(); i >= 0; i--) {
            if (matchPrix(strs, min.substring(0, i))) {
                return min.substring(0, i);
            }
        }
        return "";
    }

    public static boolean matchPrix(String[] strs, String target) {
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(target)) {
                return false;
            }
        }
        return true;
    }
}
