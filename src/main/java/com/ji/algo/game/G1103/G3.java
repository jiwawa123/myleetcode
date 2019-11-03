package com.ji.algo.game.G1103;/*
    user ji
    data 2019/11/3
    time 10:34 AM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class G3 {
    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("(a(b(c)d)"));
    }

    public static  String minRemoveToMakeValid(String s) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(' && s.charAt(i) != ')'){
                map.put(i,1);
                continue;
            }

            if (s.charAt(i) == '(') {
                list.add(i);
                continue;
            }
            if (s.charAt(i) == ')') {
                if (list.size() > 0) {
                    map.put(i, 0);
                    map.put(list.remove(list.size() - 1), 1);
                }
            }
        }
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(i))
                sp.append(s.charAt(i));
        }
        return sp.toString();
    }
}
