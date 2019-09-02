package com.ji.algo.L601_650;/*
    user ji
    data 2019/9/2
    time 6:09 PM
*/

import java.util.ArrayList;
import java.util.List;

public class StringIterator {
    public static void main(String[] args) {

    }

    List<Character> list = new ArrayList<>();
    List<Integer> sum = new ArrayList<>();

    public StringIterator(String word) {
        if (word == null || word.length() == 0)
            return;
        char tmp = word.charAt(0);
        int next = 0;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                next = next * 10 + word.charAt(i) - '0';
            } else {
                list.add(tmp);
                tmp = word.charAt(i);
                sum.add(next);
                next = 0;
            }
        }
    }

    public boolean hasNext() {
        return !sum.isEmpty();
    }

    public char next() {
        if (sum.isEmpty())
            return ' ';
        char tmp = list.get(0);
        if (sum.get(0) == 1) {
            list.remove(0);
            sum.remove(0);

        } else {
            sum.set(0, sum.get(0) - 1);

        }
        return tmp;
    }
}
