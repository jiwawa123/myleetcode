package com.ji.algo.L801_850;/*
    user ji
    data 2019/6/2
    time 6:24 PM
*/

import java.util.ArrayList;
import java.util.List;

public class LargeGroup {
    public static void main(String[] args) {

    }

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> list = new ArrayList<>();
        char[] arr = S.toCharArray();
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > 2) {
                    List<Integer> ll = new ArrayList<>();
                    ll.add(i - 1 - count + 1);
                    ll.add(i - 1);
                    list.add(ll);
                }
                count = 1;
            }
        }
        if(count>2){
            List<Integer> ll = new ArrayList<>();
            ll.add(arr.length  - count + 1);
            ll.add(arr.length - 1);
            list.add(ll);
        }
        return list;
    }
}
