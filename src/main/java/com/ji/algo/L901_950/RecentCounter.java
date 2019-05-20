package com.ji.algo.L901_950;/*
    user ji
    data 2019/5/20
    time 11:28 AM
*/

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {
    List<Integer> list = new ArrayList<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        int sum = 1;
        for (int i = list.size(); i >= 0; i--) {
            if (list.get(i) < t - 3000) {
                break;
            }
            sum += 1;
        }
        return sum;
    }
}
