package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/14:29
 */
public class L151 {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        StringBuilder sp = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].equals("")) {
                sp.append(arr[i] + " ");
            }
        }
        return sp.toString().trim();
    }
}
