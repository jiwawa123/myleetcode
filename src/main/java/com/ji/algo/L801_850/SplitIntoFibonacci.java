package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/6
    time 9:53 AM
*/

import java.util.ArrayList;
import java.util.List;

public class SplitIntoFibonacci {
    public static void main(String[] args) {
        SplitIntoFibonacci sp = new SplitIntoFibonacci();
        sp.splitIntoFibonacci("123456579");

    }

    List<Integer> res = new ArrayList<>();
    boolean flag = false;

    public List<Integer> splitIntoFibonacci(String S) {

        help(new ArrayList<>(), 0, S, "");
        return res;
    }

    public void help(List<Integer> list, int index, String S, String sp) {
        if (flag)
            return;
        if (index == S.length() && list.size() > 2) {
            res = list;
            flag = true;
        }
        for (int i = index; i < S.length(); i++) {
            sp += S.charAt(i);
            long t = Long.valueOf(sp);
            if(t>Integer.MAX_VALUE)
                break;
            if(sp.length()>1&&sp.charAt(i)=='0')
                break;
            if (list.size() < 2 || list.get(list.size() - 1) + list.get(list.size() - 2) == Integer.valueOf(sp)) {
                list.add(Integer.valueOf(sp));
                help(new ArrayList<>(list), i + 1, S, "");
                list.remove(list.size() - 1);
            }
        }
    }
}
