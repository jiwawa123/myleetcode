package com.ji.algo.L251_300;/*
    user ji
    data 2019/9/4
    time 12:34 PM
*/

import java.util.ArrayList;
import java.util.List;

public class FlipGame {
    public static void main(String[] args) {

    }

    public List<String> flip(String string) {
        List<String> list = new ArrayList<>();
        if (string == null || string.length() < 2)
            return list;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == '+' && string.charAt(i) == '+') {
                list.add(string.substring(0, i) + "--" + string.substring(i + 2, string.length()));
            }
        }
        return list;
    }
}
