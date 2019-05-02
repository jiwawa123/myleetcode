package com.ji.algo.L351_400;/*
    user ji
    data 2019/5/2
    time 4:15 PM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {

    }
    int arr[];
    public int[] shuffle() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int tmp[] = new int[list.size()];
        Random random = new Random();
        for (int i = 0; i < arr.length ;i++) {
            tmp[i] = list.get(random.nextInt(list.size()));
            list.remove(list.indexOf(tmp[i]));
        }
        return tmp;
    }
}
