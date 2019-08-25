package com.ji.algo.L901_950;/*
    user ji
    data 2019/8/25
    time 11:23 AM
*/

import java.util.ArrayList;
import java.util.List;

public class StockSpanner {

    List<Integer> prices;
    List<Integer> results;

    public StockSpanner() {
        prices = new ArrayList<>();
        results = new ArrayList<>();
    }

    public int next(int price) {
        int tail = prices.size()-1;
        int ret = 1;
        while (tail >= 0 && price >= prices.get(tail)) {
            int rt = results.get(tail);
            ret += rt;
            tail = tail - rt;
        }
        prices.add(price);
        results.add(ret);
        return ret;
    }

    public static void main(String[] args) {
        StockSpanner spanner = new StockSpanner();
        spanner.next(32);
        spanner.next(82);
        spanner.next(73);
        spanner.next(99);
        spanner.next(91);
    }
}
