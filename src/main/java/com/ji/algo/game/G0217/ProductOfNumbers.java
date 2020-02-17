package com.ji.algo.game.G0217;
/*
    user ji
    data 2020/2/17
    time 4:54 PM
*/

import java.util.ArrayList;
import java.util.List;

public class ProductOfNumbers {

    List<Integer> list;
    List<Integer> index;

    public ProductOfNumbers() {
        list = new ArrayList<>();
        index = new ArrayList<>();
    }

    public void add(int num) {
        list.add(num);
        if (num == 0) {
            index.add(list.size());
        }
    }

    public int getProduct(int k) {
        int count = 0;
        for (int i = list.size() - 1; i > list.size() - k + 1; i--) {
            if(list.get(i)==0)
                return 0;
            count*=list.get(i);
        }
        return count;
    }
}
