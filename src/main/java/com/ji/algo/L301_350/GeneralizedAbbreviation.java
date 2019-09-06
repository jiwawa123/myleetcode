package com.ji.algo.L301_350;/*
    user ji
    data 2019/9/6
    time 3:45 PM
*/

import java.util.ArrayList;
import java.util.List;

public class GeneralizedAbbreviation {
    public static void main(String[] args) {
        List<String> list = generalizedAbbreviation("word");
        System.out.println(list.size());
        list.stream().forEach(System.out::println);
    }

    public static List<String> generalizedAbbreviation(String word) {
        if (word == null || word.length() == 0)
            return null;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char tmp = word.charAt(i);
            List<String> kk = new ArrayList<>();
            if (list.isEmpty()) {
                list.add("1");
                list.add("" + tmp);
                continue;
            }
            for (int j = 0; j < list.size(); j++) {
                String t = list.get(j);
                int k = t.length() - 1;
                int count = 0;
                while (k >= 0) {
                    if (t.charAt(k) >= '0' && t.charAt(k) <= '9') {
                        count += Math.pow(10, t.length() - 1 - k) * (t.charAt(k) - '0');
                    } else {
                        break;
                    }
                    k--;
                }
                kk.add(t + tmp);
                kk.add(t.substring(0, k + 1) + (count + 1));
            }
            list = kk;
        }
        return list;
    }

}
