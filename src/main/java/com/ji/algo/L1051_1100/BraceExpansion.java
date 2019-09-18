package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/9/18
    time 8:34 AM
*/

import java.util.ArrayList;
import java.util.List;

public class BraceExpansion {
    public static void main(String[] args) {
        //List<String> res = braceExpansion("{a,b,c}d{e,f}");
        List<String> res = braceExpansion("{a,b,c}");
        res.stream().forEach(System.out::println);
    }
    public static List<String> braceExpansion(String str) {
        List<String> res = new ArrayList<>();
        if (str == null || str.length() == 0)
            return res;
        res.add("");
        List<String> next = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==',')
                continue;
            if (str.charAt(i) == '{') {
                flag = true;
                continue;
            }
            if (str.charAt(i) == '}') {
                List<String> tmp = new ArrayList<>();
                for (int j = 0; j < res.size(); j++) {
                    for (int k = 0; k < next.size(); k++) {
                        tmp.add(res.get(j) + next.get(k));
                    }
                }
                res = tmp;
                next = new ArrayList<>();
                flag = false;
                continue;
            }
            if (flag) {
                next.add("" + str.charAt(i));
            } else {
                List<String> tmp = new ArrayList<>();
                for (int j = 0; j < res.size(); j++) {
                    tmp.add(res.get(j) + str.charAt(i));
                }
                res = tmp;
            }
        }
        return res;
    }
}
