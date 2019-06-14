package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/6/14
    time 1:40 PM
*/

import java.util.ArrayList;
import java.util.List;

public class FindOcurrences {
    public static void main(String[] args) {

    }

    public String[] findOcurrences(String text, String first, String second) {
        String tmp[] = text.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 2; i < tmp.length; i++) {
            if (tmp[i - 1].equals(second) && tmp[i - 2].equals(first))
                list.add(tmp[i]);
        }
        return list.toArray(new String[list.size()]);
    }
}
