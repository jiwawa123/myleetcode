package com.ji.algo.L751_800;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/10/22
 * time 4:25 下午
 */
public class L763 {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }

    public static List<Integer> partitionLabels(String S) {
        int end[] = new int[26];
        Arrays.fill(end, Integer.MIN_VALUE);
        for (int i = 0; i < S.length(); i++) {
            int tmp = S.charAt(i) - 'a';
            end[tmp] = Math.max(end[tmp], i);
        }
        List<Integer> res = new LinkedList<>();
        int left = 0;
        int tmp = 0;
        for (int i = 0; i < S.length(); i++) {
            int last = end[S.charAt(i) - 'a'];
            if (tmp < last) {
                tmp = last;
            }
            if (i == tmp) {
                res.add(i - left + 1);
                left = i + 1;
            }
        }
        return res;
    }
}
