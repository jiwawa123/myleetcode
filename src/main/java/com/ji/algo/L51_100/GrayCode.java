package com.ji.algo.L51_100;/*
    user ji
    data 2019/8/18
    time 9:56 PM
*/

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static void main(String[] args) {

    }

    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1 << n; ++i)
            list.add(i ^ i >> 1);
        return list;

    }
}
