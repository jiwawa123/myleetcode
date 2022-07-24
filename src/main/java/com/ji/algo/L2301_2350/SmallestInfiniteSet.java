package com.ji.algo.L2301_2350;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/24/上午10:40
 */
public class SmallestInfiniteSet {
    boolean[] arr = new boolean[1001];
    int min = 1;

    public SmallestInfiniteSet() {

    }

    public int popSmallest() {
        for (int i = min; i < 1001; i++) {
            if (!arr[i]) {
                arr[i] = true;
                min = i;
                break;
            }
        }
        int tmp = min;
        min++;
        return tmp;
    }

    public void addBack(int num) {
        arr[num] = false;
    }
}
