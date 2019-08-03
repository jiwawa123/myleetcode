package com.ji.algo.L951_1000;/*
    user ji
    data 2019/8/3
    time 10:54 AM
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumsSameConsecDiff {
    public static void main(String[] args) {

        NumsSameConsecDiff numsSameConsecDiff = new NumsSameConsecDiff();
        System.out.println(numsSameConsecDiff.numsSameConsecDiff(3, 7));
    }

    Set<Integer> list;

    public int[] numsSameConsecDiff(int N, int K) {
        list = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            help(i, i + "", K, N);
        }
        int arr[] = new int[list.size()];
        int index = 0;
        for (int tmp : list
                ) {
            arr[index++] = tmp;
        }
        return arr;
    }

    public void help(int last, String tmp, int K, int N) {
        if (tmp.length() == N) {
            if(tmp.charAt(0)!='0'||tmp.length()==1)
                list.add(Integer.valueOf(tmp));
            return;
        }

        if (last + K <= 9 && last + K >= 0) {
            help(last + K, tmp + (last + K), K, N);
        }
        if (last - K <= 9 && last - K >= 0) {
            help(last - K, tmp + (last - K), K, N);
        }
    }
}
