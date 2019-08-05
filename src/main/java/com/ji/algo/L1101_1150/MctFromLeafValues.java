package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/7/23
    time 9:50 AM
*/

import java.util.*;

public class MctFromLeafValues {
    public static void main(String[] args) {
        MctFromLeafValues mctFromLeafValues = new MctFromLeafValues();
        int arr[] = {6, 2, 4};
        System.out.println(mctFromLeafValues.mctFromLeafValues(arr));
    }

    int count = 0;

    public int mctFromLeafValues(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        help(list);
        return count;

    }

    public void help(List<Integer> list) {
        if (list.size() == 1)
            return;
        Collections.sort(list);
        int f = list.remove(0);
        int s = list.remove(0);
        count += f * s;
        list.add(f * s);

        help(list);
    }

}
