package com.ji.algo.G0322;

/**
 * user ji
 * data 2020/3/22
 * time 10:30 AM
 */
public class G4 {
    public static void main(String[] args) {
        System.out.println(longestPrefix("leetcodeleet"));
    }

    static int next[];

    public static String longestPrefix(String s) {
        String res = "";
        getNext(s.toCharArray());
        if (next[s.length() - 1] != 0) {
            return s.substring(s.length() - next[s.length() - 1], s.length());
        }
        return res;
    }

    static void getNext(char p[]) {
        int len = p.length;
        next = new int[len];
        next[0] = 0;
        int i = 0, j = 0;
        for (j = 1; j < len; j++) {                // i 代表最长前缀后缀长度
            while (p[i] != p[j] && i > 0)          // 当p[i] != p[j] 时，减小最长前缀后缀长度
                i = next[i - 1];
            if (p[i] == p[j]) {
                i++;                               //最长公共前缀后缀长度+1
                next[j] = i;                       //匹配失败时跳到该处
            } else
                next[j] = 0;
        }
    }
}
