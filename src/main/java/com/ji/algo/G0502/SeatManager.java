package com.ji.algo.G0502;

import java.util.Set;
import java.util.TreeSet;

/**
 * user ji
 * data 2021/5/2
 * time 4:41 下午
 */
public class SeatManager {
    Set<Integer> set = new TreeSet<>();

    public SeatManager(int n) {
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
    }

    public int reserve() {
        int res = 0;
        for (int t : set) {
            res = t;
            break;
        }
        set.remove(res);
        return res;
    }

    public void unreserve(int seatNumber) {
        set.add(seatNumber);
    }
}
