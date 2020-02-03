package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/2/3
    time 10:02 AM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FilterRestaurants {
    public static void main(String[] args) {

    }

    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer> res = new ArrayList<>();
        List<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < restaurants.length; i++) {
            if (restaurants[i][2] < veganFriendly || restaurants[i][3] >= maxPrice || restaurants[i][4] >= maxDistance) {

            } else {
                tmp.add(restaurants[i]);
            }
        }
        Collections.sort(tmp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1])
                    return o1[0] - o2[0];
                return o2[1] - o1[1];
            }
        });
        for (int i = 0; i < tmp.size(); i++) {
            res.add(tmp.get(i)[0]);
        }
        return res;
    }
}
