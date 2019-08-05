package com.ji.algo.L51_100;/*
    user ji
    data 2019/8/5
    time 10:51 AM
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumDecodings {
    public static void main(String[] args) {
        NumDecodings numDecodings = new NumDecodings();
        System.out.println(numDecodings.numDecodings("110"));
    }


    //不能直接使用回溯算法，因为这样会超时，可以使用类似爬楼梯似的动态规划的算法
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0')
            return 0;
        if (s.length() < 2)
            return 1;
        int tmp[] = new int[s.length()];
        tmp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) > '2' || s.charAt(i - 1) == '0')
                    return 0;
                else
                    tmp[i] = i > 1 ? tmp[i - 2] : 1;
                continue;
            }

            int tt = Integer.valueOf("" + s.charAt(i - 1) + "" + s.charAt(i));
            if (tt > 26 || s.charAt(i - 1) == '0') {
                tmp[i] = tmp[i - 1];
                continue;
            }
            if (i >= 2) {
                tmp[i] = tmp[i - 1] + tmp[i - 2];
                continue;
            }
            tmp[i] = 2;
        }
        return tmp[s.length() - 1];
    }


}
