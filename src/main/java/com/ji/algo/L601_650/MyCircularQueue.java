package com.ji.algo.L601_650;/*
    user ji
    data 2019/8/15
    time 1:15 PM
*/

import java.util.ArrayList;
import java.util.List;

public class MyCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue my = new MyCircularQueue(6);
        my.enQueue(6);
        System.out.println(my.Rear());
        System.out.println(my.Rear());
        my.deQueue();
        my.enQueue(5);
        System.out.println(my.Rear());
        my.deQueue();
        my.deQueue();
        System.out.println(my.Front());
        my.deQueue();
    }

    int size;
    int count;
    List<Integer> list = new ArrayList();

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        size = k;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (list.size() == size)
            return false;
        list.add(0, value);
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (list.size() == 0)
            return false;
        list.remove(list.size() - 1);
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (list.size() == 0)
            return -1;
        return list.get(list.size() - 1);
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (list.size() == 0)
            return -1;
        return list.get(0);
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return list.size() == size;
    }
}
