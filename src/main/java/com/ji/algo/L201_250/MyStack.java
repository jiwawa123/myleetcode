package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/21
    time 9:37 PM
*/

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    public static void main(String[] args) {

    }

    List<Integer> list;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        list = new ArrayList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        list.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int tmp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return tmp;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return list.get(list.size() - 1);
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return list.isEmpty();
    }
}
