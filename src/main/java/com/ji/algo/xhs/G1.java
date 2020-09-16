package com.ji.algo.xhs;

import java.util.Arrays;

/**
 * user ji
 * data 2020/9/12
 * time 10:17 上午
 */
public class G1 {
    public static void main(String[] args) {
        int arr[] = {7,
                2,
                5,
                8,
                9,
                11,
                34,
                10};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] tree) {
        if (tree == null || tree.length == 0)
            return 1;
        boolean tmp[] = new boolean[tree.length];
        for (int i = 0; i < tmp.length; i++) {
            if(tree[i]>tmp.length)
                continue;
            tmp[tree[i] - 1] = true;
        }
        for (int i = 0; i < tmp.length; i++) {
            if (!tmp[i])
                return i + 1;
        }
        return tree.length + 1;
    }
}
