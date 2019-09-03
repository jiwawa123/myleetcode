package com.ji.algo.L351_400;/*
    user ji
    data 2019/9/3
    time 3:38 PM
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DesignPhoneDirectory {
    public static void main(String[] args) {

    }

    Random rd;
    List<Integer> list;

    public DesignPhoneDirectory() {
        rd = new Random();
        list = new ArrayList<>();
    }

    public int get() {
        int index = rd.nextInt(list.size());
        return list.remove(index);
    }

    public boolean check(int target) {
        return list.indexOf(target) != -1;
    }

    public void release(int number) {
        if (list.indexOf(number) == -1)
            list.add(number);
    }

}
