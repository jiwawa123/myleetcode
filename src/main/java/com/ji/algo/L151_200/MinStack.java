package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/16
    time 9:19 AM
*/

import java.util.Stack;

public class MinStack {
    //设计思路，每次多花一个位置存储最小的元素，这样在获取最小的元素的时候直接获取
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }


    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            stack.push(x);
        } else {
            int tmp = stack.peek();
            if (x < tmp) {
                stack.push(x);
                stack.push(x);
            } else {
                stack.push(x);
                stack.push(tmp);
            }
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return stack.get(stack.size() - 2);
    }

    public int getMin() {
        return stack.pop();
    }
}
