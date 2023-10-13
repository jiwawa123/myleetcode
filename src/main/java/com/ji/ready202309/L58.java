package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/09:03
 */
public class L58 {
    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }
}
