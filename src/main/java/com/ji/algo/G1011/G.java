package com.ji.algo.G1011;

/**
 * user ji
 * data 2020/10/11
 * time 11:44 下午
 */
public class G {
    public static void main(String[] args) {

    }

    public int maxDepth(String s) {
        int left = 0;
        int res = 0;
        for (char c : s.toCharArray()
        ) {
            if (c == '(') {
                left++;
                res = Math.max(left, res);
            }
            if (c == ')')
                left--;
        }
        return res;
    }
}
