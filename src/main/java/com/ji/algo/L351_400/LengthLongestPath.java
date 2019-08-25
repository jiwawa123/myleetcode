package com.ji.algo.L351_400;/*
    user ji
    data 2019/8/25
    time 9:37 AM
*/

import java.util.HashMap;
import java.util.Map;

public class LengthLongestPath {
    public static void main(String[] args) {
        String arr = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        System.out.println(lengthLongestPath(arr));
    }

    public static int lengthLongestPath(String input) {
        int maxLen = 0, level = 1, cnt = 0;
        boolean isFile = false;

        Map<Integer, Integer> dir = new HashMap<>();
        dir.put(0, 0);
        char[] str = input.toCharArray();
        int i = 0, len = str.length;
        while (i < len) {
            while (str[i] == '\t') {
                ++level;
                ++i;
            }

            while (i < len && str[i] != '\n') {
                if (str[i] == '.') isFile = true;
                ++cnt;
                ++i;
            }

            if (isFile) maxLen = Math.max(maxLen, dir.get(level - 1) + cnt);
            else dir.put(level, dir.get(level - 1) + cnt + 1);

            cnt = 0;
            level = 1;
            isFile = false;

            ++i;
        }

        return maxLen;
    }
}
