package com.ji.new_algo;/*
    user ji
    data 2019/5/29
    time 8:22 PM
*/

import java.util.ArrayList;
import java.util.List;

//面试反馈，实现全排列使用回溯算法
public class Combine {
    public static void main(String[] args) {
        combine(4);
    }

    public static void combine(int N) {
        List<Integer> list = new ArrayList<>();
        help(list, 1, N);
    }

    public static void help(List<Integer> tmp, int start, int N) {
        if (tmp.size() == N) {
            System.out.println(tmp);
        }
        for (int i = start; i <= N; i++) {
            if (tmp.indexOf(i) == -1) {
                tmp.add(i);
                help(tmp, 1, N);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}
