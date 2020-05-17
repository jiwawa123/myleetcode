package com.ji.algo.L1401_1450;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/5/12
 * time 10:42 上午
 */
public class BuildArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 8, 9, 10};
        buildArray(arr, 10);
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> res = new LinkedList();
        int index = 0;
        while (index < target.length) {
            for (int i = index == 0 ? 1 : target[index - 1] + 1; i < target[index]; i++) {
                res.add("push");
                res.add("pop");
            }

            res.add("push");
            index++;
        }
        return res;
    }


}
