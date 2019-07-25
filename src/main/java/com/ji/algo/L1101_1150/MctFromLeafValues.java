package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/7/23
    time 9:50 AM
*/

import java.util.*;

public class MctFromLeafValues {
    public static void main(String[] args) {

    }
    int count = 0;
    public int mctFromLeafValues(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

        }
        Collections.sort(list);
        return count;
    }
    public void help(List<Integer> list){

    }
    public void addToList(int tmp,List<Integer> list){

    }

}
