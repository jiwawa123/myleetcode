package com.ji.algo.L1801_1850;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * user ji
 * data 2021/3/28
 * time 5:38 下午
 */
public class L5714 {
    public static void main(String[] args) {

    }

    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }
        StringBuilder sp = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    sp.append(tmp.toString());
                    tmp = new StringBuilder();
                    break;
                case ')':
                    String value = map.getOrDefault(tmp.toString(), "?");
                    sp.append(value);
                    tmp = new StringBuilder();
                    break;
                default:
                    tmp.append(s.charAt(i));
            }
        }
        if (tmp.length() > 0) {
            sp.append(tmp.toString());
        }
        return sp.toString();
    }
}
