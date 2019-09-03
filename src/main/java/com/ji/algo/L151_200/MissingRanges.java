package com.ji.algo.L151_200;/*
    user ji
    data 2019/9/3
    time 6:07 PM
*/

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static void main(String[] args) {

    }

    public List<String> missRanges(int arr[]) {
        List<String> list = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == start) {
                start = arr[i] + 1;
            } else {
                if (start == arr[i] - 1) {
                    list.add(start + "");
                } else {
                    list.add(start + "->" + (arr[i] - 1));
                }
                start++;
            }
        }
        if (start < 99) {
            list.add(start + "->" + 99);
        }
        return list;
    }
}
