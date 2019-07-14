package com.ji.algo.L951_1000;/*
    user ji
    data 2019/7/12
    time 4:18 PM
*/

import java.util.HashMap;
import java.util.Map;

public class Speller {
    public static void main(String[] args) {
        String tmp[] = {"KiTe", "kite", "hare", "Hare"};
        String tmp1[] = {"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};
        System.out.println(new Speller().isMatchI("kite", "keti"));
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();
        for (int i = 0; i < wordlist.length; i++) {
            map.put(wordlist[i], 1);
            if(!map1.containsKey(wordlist[i].toLowerCase()))
                map1.put(wordlist[i].toLowerCase(), wordlist[i]);
        }
        String res[] = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = "";
            if (map.containsKey(queries[i])) {
                res[i] = queries[i];
                continue;
            }
            if(map1.containsKey(queries[i].toLowerCase())){
                res[i] = queries[i];
                continue;
            }
            for (int j = 0; j < wordlist.length; j++) {
                if (isMatchI(wordlist[j], queries[i])) {
                    res[i] = wordlist[j];
                    break;
                }
            }


        }
        return res;
    }

    public boolean isMatchI(String a, String b) {
        char tmp[] = {'a', 'e', 'i', 'o', 'u'};
        Map<Character, Integer> map = new HashMap<>();
        for (char t : tmp
                ) {
            map.put(t, 1);
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i) || (map.containsKey(a.charAt(i)) && map.containsKey(b.charAt(i))))
                continue;
            return false;
        }
        return true;
    }
}
