package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 11:01 AM
*/

import java.util.ArrayList;
import java.util.List;

public class MinimumTotal {
    public static void main(String[] args) {

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        if (null == triangle || triangle.size() == 0)
            return 0;
        int min = 0;
        List<Integer> next = new ArrayList<>();
        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> tmp = new ArrayList<>();
            List<Integer> tt = triangle.get(i);
            min = Integer.MAX_VALUE;
            for (int j = 0; j < tt.size(); j++) {
                if (i == 0) {
                    tmp.add(tt.get(i));
                    min = Math.min(tt.get(i), min);
                } else {
                    if (j == 0) {
                        tmp.add(next.get(i) + tt.get(i));
                        min = Math.min(min, tmp.get(i));
                        continue;
                    }
                    if (j == tt.size() - 1) {
                        tmp.add(next.get(i - 1) + tt.get(i));
                        min = Math.min(min, tmp.get(i));
                        continue;
                    }
                    tmp.add(Math.min(next.get(i - 1), next.get(i)) + tt.get(i));
                    min = Math.min(min, tmp.get(i));
                }
            }
            next = tmp;

        }
        return min;
    }

}
