package com.ji.ready202309;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/14/23:50
 */
public class MyStack {

    int i = 0;
    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> queue1 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        if (i % 2 == 0) {
            queue.add(x);
        } else {
            queue1.add(x);
        }
    }

    public int pop() {
        int t = -1;
        if (i == 1) {
            while (queue1.isEmpty()) {
                t = queue1.poll();
                if (!queue1.isEmpty()) {
                    queue.add(t);
                }

            }
        } else {

            while (queue.isEmpty()) {
                t = queue.poll();
                if (!queue.isEmpty()) {
                    queue1.add(t);
                }

            }
        }

        i = (i + 1) % 2;
        return t;
    }

    public int top() {
        int t = -1;
        if (i == 1) {
            while (queue1.isEmpty()) {
                t = queue1.poll();
                queue.add(t);
            }
        } else {

            while (queue.isEmpty()) {
                t = queue.poll();
                queue1.add(t);
            }
        }

        i = (i + 1) % 2;
        return t;
    }

    public boolean empty() {
        return queue.isEmpty() && queue1.isEmpty();
    }
}
