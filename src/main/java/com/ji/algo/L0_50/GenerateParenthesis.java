package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/8
    time 9:10 PM
*/

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {

    }

    public static List<String> list;

    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        doadd(n, n, "");
        return list;
    }

    public static void doadd(int left, int right, String path) {
        //递归的出口
        if (left == 0 && right == 0) {
            list.add(path);
            return;
        }
        if (left > 0) {
            doadd(left - 1, right, path + "(");
        }
        if (right > 0 && right > left) {
            doadd(left, right - 1, path + ")");
        }
    }
}
