package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/5
    time 9:41 PM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindWords {

    public static void main(String[] args) {


    }

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        char[] tmp = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',};
        char[] tmp1 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',};
        char[] tmp2 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        for (int i = 0; i < tmp.length; i++) {
            map.put(tmp[i], 1);
        }
        for (int i = 0; i < tmp1.length; i++) {
            map.put(tmp1[i], 2);
        }
        for (int i = 0; i < tmp.length; i++) {
            map.put(tmp2[i], 3);
        }
        for (String str : words
                ) {
            String tp = str.toLowerCase();
            int k = map.get(tp.charAt(0));
            int count = 1;
            for (int i = 1; i < tp.length(); i++) {
                if (map.get(tp.charAt(i)) != k)
                    break;
            }
            if (count == tp.length())
                list.add(str);
        }
        return list.toArray(new String[list.size()]);
    }
}
