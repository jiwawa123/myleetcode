package com.ji.ready202309;

import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/11:13
 */
public class MyQueue {

    Stack<Integer> left;
    Stack<Integer> right;

    public MyQueue() {
        left = new Stack<>();
        right = new Stack<>();
    }


    public void push(int x) {
        left.add(x);
    }

    public int pop() {
        if (right.isEmpty()) {
            while (!left.isEmpty()) {
                right.add(left.pop());
            }
        }
        return right.pop();
    }

    public int peek() {
        if (right.isEmpty()) {
            while (!left.isEmpty()) {
                right.add(left.pop());
            }
        }
        return right.peek();
    }

    public boolean empty() {
        return left.isEmpty() && right.isEmpty();
    }
}
