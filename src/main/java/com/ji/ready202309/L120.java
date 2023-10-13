package com.ji.ready202309;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/11/22:06
 */
public class L120 {
    public static void main(String[] args) {

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int m = Integer.MAX_VALUE;
        List<Integer> tmp = new LinkedList<>();
        for (List<Integer> list : triangle
        ) {
            if (list.size() == 1) {
                m = list.get(0);
                tmp = list;
                continue;
            } else {
                List<Integer> next = new LinkedList<>();
                m = Integer.MAX_VALUE;
                for (int i = 0; i < list.size(); i++) {
                    if (i == 0) {
                        next.add(tmp.get(0) + list.get(i));
                    } else if (i == list.size() - 1) {
                        next.add(tmp.get(tmp.size() - 1) + list.get(i));
                    } else {
                        next.add(list.get(i) + Math.min(tmp.get(i), tmp.get(i - 1)));
                    }


                    m = Math.min(next.get(i), m);
                }
                tmp = next;
            }


        }

        return m;
    }
}
