package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/09:20
 */
public class L28 {
    public static void main(String[] args) {

    }

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
