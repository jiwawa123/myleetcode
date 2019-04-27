package com.ji.algo.L301_350;/*
    user ji
    data 2019/4/27
    time 7:29 PM
*/

import java.util.ArrayList;
import java.util.List;

public class IsAdditiveNumber {
    public static void main(String[] args) {
        new IsAdditiveNumber().isAdditiveNumber("112358");
    }

    boolean flag = false;

    public boolean isAdditiveNumber(String num) {
        if (num.length() <= 2) return false;
        dfs(num, 0, new ArrayList<Long>());
        return flag;
    }
    //经典的回溯算法
    public void dfs(String num, int i, List<Long> res) {
        int n = res.size(),
                len = num.length(),
                tlen = -1;
        long val = -1;
        if (i == len && n > 2) {
            flag = true;
            return;
        }
        if (n >= 2) {
            val = res.get(n - 1) + res.get(n - 2);
            tlen = (val + "").length();
        }
        for (int j = i + 1; ((n >= 2 && (j = i + tlen) <= len) || (j <= i + (len - i) / 2 && j <= len)) && !flag; j++) {
            if (num.charAt(i) == '0' && j != i + 1) break;
            if (n == 0 || n == 1 || val == Long.valueOf(num.substring(i, j))) {
                res.add(Long.valueOf(num.substring(i, j)));//System.out.println(res);
                dfs(num, j, res);
            }
            if (j == i + tlen) break;
        }
        if (!res.isEmpty())
            res.remove(res.size() - 1);
    }
}
