package com.ji.algo.G1130;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/12/2
 * time 9:23 下午
 */
public class FrontMiddleBackQueue {
    public static void main(String[] args) {
        FrontMiddleBackQueue queue = new FrontMiddleBackQueue();
        queue.pushFront(1);
        queue.pushBack(2);
        queue.pushMiddle(3);
        queue.pushMiddle(4);
        System.out.println(queue.popFront());
        System.out.println(queue.popMiddle());
        System.out.println(queue.popMiddle());
        System.out.println(queue.popBack());
        System.out.println(queue.popFront());
    }

    List<Integer> list = new LinkedList<>();

    public FrontMiddleBackQueue() {

    }

    public void pushFront(int val) {
        list.add(0, val);
    }

    public void pushMiddle(int val) {
        int len = list.size();
        list.add(len / 2, val);
    }

    public void pushBack(int val) {
        list.add(val);
    }

    public int popFront() {
        if (list.size() == 0)
            return -1;
        return list.remove(0);
    }

    public int popMiddle() {
        if (list.size() == 0)
            return -1;
        int index = list.size() % 2 == 0 ? list.size() / 2 - 1 : list.size() / 2;
        return list.remove(index);
    }

    public int popBack() {
        if (list.size() == 0)
            return -1;
        return list.remove(list.size() - 1);

    }
}
