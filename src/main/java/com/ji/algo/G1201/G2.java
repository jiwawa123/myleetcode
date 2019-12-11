package com.ji.algo.G1201;/*
    user ji
    data 2019/12/1
    time 10:24 AM
*/

import java.util.ArrayList;
import java.util.List;

public class G2 {
    public static void main(String[] args) {
        numOfBurgers(2385088,
                164763).stream().forEach(System.out::println);
    }

    public static List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> list = new ArrayList<>();
        long t = (long)tomatoSlices - 2 * (long)cheeseSlices;
        if (t < 0 || t % 2 != 0)
            return list;
        int x = (int)t / 2;
        int y = cheeseSlices - x;
        if(x<0||y<0)
            return list;
        list.add(x);
        list.add(y);
        return list;
    }
}
