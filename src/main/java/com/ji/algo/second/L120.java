package com.ji.algo.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/7/14
 * time 7:24 上午
 */
public class L120 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3,4));
        list.add(Arrays.asList(1));
        list.add(Arrays.asList(1));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null||triangle.isEmpty())
            return 0;
        int max = Integer.MIN_VALUE;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < triangle.size(); i++) {
            max = Integer.MIN_VALUE;
            List<Integer> tmp = new LinkedList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int num = triangle.get(i).get(j);
                if (i == 0) {
                    tmp.add(num);
                } else {
                    if (j == 0) {
                        tmp.add(num + list.get(0));
                    } else if (j == triangle.get(i).size() - 1) {
                        tmp.add(num + list.get(list.size() - 1));
                    } else {
                        tmp.add(num + Math.max(list.get(j - 1), list.get(j)));
                    }

                }
                max = Math.max(max, tmp.get(j));
            }
            list = tmp;
        }

        return max;
    }
}

