package com.ji.ready202309;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/13:43
 */
public class MinStack {


    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        // 空间换时间，直接写双份数据
        int min = -1;
        if (stack.isEmpty()) {
            min = val;
        } else {
            min = Math.min(stack.peek(),val);
        }

        stack.add(val);
        stack.add(min);
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        int min = stack.pop();
        int res = stack.peek();
        stack.add(min);
        return res;

    }

    public int getMin() {
        return stack.peek();
    }
}
