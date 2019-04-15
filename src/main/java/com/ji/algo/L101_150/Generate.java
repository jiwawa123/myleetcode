package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 10:32 AM
*/

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0)
            return list;
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        list.add(tmp);
        if (numRows == 1)
            return list;
        for (int i = 2; i <= numRows; i++) {
            List<Integer> next = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    next.add(1);
                } else {
                    next.add(tmp.get(j - 1) + tmp.get(j));
                }
            }
            list.add(next);
            tmp = next;
        }
        return list;
    }
}
