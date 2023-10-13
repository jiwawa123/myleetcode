package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/23:21
 */
public class L6 {
    public static void main(String[] args) {
        String res = "AB";
        new L6().convert(res, 1);
    }

    public String convert(String s, int numRows) {
        int len = s.length();
        char[][] arr = new char[numRows][len];
        int[] dx = {1, -1};
        int[] dy = {0, 1};
        int d = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j] = ' ';
            }
        }
        for (int i = 0, x = 0, y = 0; i < len; i++) {
            arr[x][y] = s.charAt(i);
            int a = x + dx[d];
            int b = y + dy[d];
            if (a < 0 || a >= numRows || b < 0 || b >= len) {
                d = (d + 1) % 2;
            }
            x += dx[d];
            y += dy[d];
        }
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i][j] != ' ') {
                    sp.append(arr[i][j]);
                }
            }
        }
        return sp.toString();
    }
}
