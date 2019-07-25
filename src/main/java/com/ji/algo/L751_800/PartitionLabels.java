package com.ji.algo.L751_800;/*
    user ji
    data 2019/7/25
    time 2:39 PM
*/

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }

    public static List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[26];
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a'] = i;
        }
        int index = 0;
        while (index < S.length()) {
            index = arr[S.charAt(index) - 'a'];
            int len = list.size() == 0 ? 0 : list.get(list.size() - 1);
            for (int i = len + 1; i < index; i++) {
                index = Math.max(index, arr[S.charAt(i) - 'a']);
            }
            list.add(index);
            index++;
        }
        for (int i = list.size() - 1; i > 0; i--) {
            list.set(i, list.get(i) - list.get(i - 1));
        }
        list.set(0,list.get(0) + 1);
        return list;
    }
}
