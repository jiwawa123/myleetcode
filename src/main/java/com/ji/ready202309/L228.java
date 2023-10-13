package com.ji.ready202309;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/15:37
 */
public class L228 {
    public static void main(String[] args) {

    }

    public List<String> summaryRanges(int[] nums) {
        StringBuilder sp = new StringBuilder();

        List<String> list = new LinkedList<>();
        if (null == nums || nums.length == 0) {
            return list;
        }
        int start = nums[0];
        sp.append(start);
        int k = start;
        for (int i = 1; i < nums.length; i++) {
            if (k + 1 == nums[i]) {
                k++;
            } else {
                if (k > start) {
                    sp.append("->");
                    sp.append(k);
                    list.add(sp.toString());
                    sp = new StringBuilder();
                    start = nums[i];
                    sp.append(start);
                    k = start;
                } else if (k == start) {
                    list.add(sp.toString());
                    start = nums[i];
                    sp.append(start);
                    k = start;
                }
            }
        }

        if (k > start) {
            sp.append("->");
            sp.append(k);
        }
        list.add(sp.toString());

        return list;
    }
}
