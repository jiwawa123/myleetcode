package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/14
    time 8:23 PM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmbiguousCoordinates {
    public static void main(String[] args) {
        AmbiguousCoordinates am = new AmbiguousCoordinates();
        List<String> list = am.ambiguousCoordinates("(0123)");
        list.forEach(System.out::println);
    }

    Map<String, List<String>> map;

    public List<String> ambiguousCoordinates(String S) {
        S = S.substring(1, S.length() - 1);
        List<String> list = new ArrayList<>();
        long a = Long.valueOf(S);
        if (a == 0 && S.length() > 2)
            return list;
        map = new HashMap<>();
        for (int i = 1; i < S.length(); i++) {
            String left = S.substring(0, i);
            String right = S.substring(i, S.length());
            List<String> l = help(left);
            List<String> r = help(right);
            for (String ll : l
                    ) {
                for (String rr : r
                        ) {
                    list.add("(" + ll + "," + rr + ")");
                }
            }
        }
        return list;
    }

    public List<String> help(String s) {
        List<String> list = new ArrayList<>();
        Long a = Long.valueOf(s);
        if (a == 0 && s.length() > 1)
            return list;
        if (map.containsKey(s))
            return map.get(s);
        if (a == 0 && s.length() == 1) {
            list.add("0");
            return list;
        }
        if(a!=0&&s.charAt(0)!='0')
            list.add(s);
        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i, s.length());
            if (left.length() > 1 && Integer.valueOf(left) == 0) {
                break;
            }
            if (left.length() > 1 && left.charAt(0) == '0') {
                break;
            }
            if (Integer.valueOf(right) == 0||Integer.valueOf(right)%10==0) {
                break;
            }
            list.add(left + "." + right);
        }
        map.put(s, list);
        return list;
    }
}
