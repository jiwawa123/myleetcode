package com.ji.algo.G1215;/*
    user ji
    data 2019/12/15
    time 10:35 AM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class G2 {
    public static void main(String[] args) {
        sequentialDigits(1000,13000).stream().forEach(System.out::println);
    }
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            int count = i;
            int index = i;
            for (int j = 0; j < 10; j++) {
                if(count>=low&&count<=high){
                    list.add(count);
                }
                if(index==9)
                    break;
                count*=10;
                count+=++index;
                if(count>high)
                    break;
            }
        }
        Collections.sort(list);
        return list;
    }
}
