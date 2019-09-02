package com.ji.algo.L701_750;/*
    user ji
    data 2019/9/2
    time 6:52 PM
*/

import java.util.ArrayList;
import java.util.List;

public class MaxStack {
    public static void main(String[] args) {

    }

    List<Integer> list = new ArrayList<>();

    public void push(int tmp) {
        list.add(tmp);
    }

    public int pop() {
        return list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int peekMax() {
        int max = Integer.MIN_VALUE;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public int popMax() {
        int max = Integer.MIN_VALUE;
        int index = list.size() - 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > max) {
                max = list.get(i);
                index = i;
            }
        }
        return list.remove(index);
    }
}
