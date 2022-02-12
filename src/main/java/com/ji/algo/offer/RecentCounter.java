package com.ji.algo.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/29/上午10:56
 */
public class RecentCounter {
    public static void main(String[] args) {


    }

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
