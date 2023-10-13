package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/11/23:02
 */
public class L168 {
    public static void main(String[] args) {
        convertToTitle(701);
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            result.append((char) ('A' + (columnNumber - 1) % 26));
            columnNumber = (columnNumber - 1) / 26;
        }
        return result.reverse().toString();
    }
}
