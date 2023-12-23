package com.ji.algo.L2851_2900;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/15/18:07
 */
public class L100000095 {
    public static void main(String[] args) {

    }

    public final String pre = "prev";

    public List<Integer> lastVisitedIntegers(List<String> words) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> res = new LinkedList<>();
        int right = 0, len = 0;
        while (right < words.size()) {
            if (words.get(right).equals(pre)) {
                len++;
                if (len > list.size()) {
                    res.add(-1);
                } else {
                    res.add(list.get(list.size() - len));
                }
            } else {
                int n = Integer.valueOf(words.get(right));
                list.add(n);
                len = 0;
            }
            right++;
        }
        return res;
    }
}
