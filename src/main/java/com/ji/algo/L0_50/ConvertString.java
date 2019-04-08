package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/7
    time 10:56 PM
*/

public class ConvertString {
    public static void main(String[] args) {
        convert("ABCD",
                3);
    }

    //Z字形排列
    // 这个问题主要是可以先将排列列出来，然后一次遍历即可，就是顺着这种排列顺序进行填入
    public static String convert(String s, int numRows) {
        StringBuffer sp = new StringBuffer();
        //每种情况下，行数是固定的
        //先确定列数
        int col = s.length() / (2 * numRows - 1) * numRows + 1;
        int index = 0;
        char[][] result = new char[numRows][col];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = '-';
            }
        }
        int row = 0;
        for (int i = 0; i < col; i++) {
            if (row < 0)
                row = 1;
            if (index == s.length())
                break;
            if (row == 0) {
                while (row < numRows && index < s.length()) {
                    result[row++][i] = s.charAt(index++);
                }
                continue;
            }
            if (row == numRows) {
                row = numRows - 2;
                result[row--][i] = s.charAt(index++);
                continue;
            }
            if (row > 0) {
                result[row--][i] = s.charAt(index++);
                continue;
            }

        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] != '-')
                    sp.append(result[i][j]);
            }
        }
        return sp.toString();
    }
}
