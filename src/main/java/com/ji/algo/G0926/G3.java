package com.ji.algo.G0926;

/**
 * user ji
 * data 2020/9/26
 * time 3:13 下午
 */
public class G3 {
    public static void main(String[] args) {

    }

    public int isValid(String tmp) {
        int res = 0;
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == '(') {
                res++;
            }
            if (tmp.charAt(i) == ')') {
                if (res < 1)
                    return 0;
                res--;
            }
        }


        return res == 0 ? 1 : 0;
    }
}
