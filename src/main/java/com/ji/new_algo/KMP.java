package com.ji.new_algo;/*
    user ji
    data 2019/5/29
    time 11:26 AM
*/

public class KMP {
    public static void main(String[] args) {
        System.out.println(kmp("hellohhhellhello", "hello"));
    }

    public static int kmp(String tmp, String tmp_1) {
        int arr[] = next(tmp_1);
        int index = -1;
        int j = 0;
        for (int i = 0; i < tmp.length(); i++) {

            if (tmp.charAt(i) == tmp_1.charAt(j)) {
                j++;
            } else {
                j = arr[j];
            }
            if (j == tmp_1.length()) {
                return i - j + 1;
            }
        }
        return index;
    }

    public static int[] next(String tmp) {
        int arr[] = new int[tmp.length()];
        arr[0] = 0;
        int len = 0;
        int i = 1;
        while (i < tmp.length()) {
            if (tmp.charAt(len) == tmp.charAt(i)) {
                len++;
                arr[i] = len;
                i++;
            } else {
                if (len > 0)
                    len = arr[len - 1];
                else {
                    arr[i] = len;
                    i++;
                }
            }
        }
        return arr;
    }
}
