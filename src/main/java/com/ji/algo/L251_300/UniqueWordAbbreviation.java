package com.ji.algo.L251_300;/*
    user ji
    data 2019/9/14
    time 11:25 AM
*/

import java.util.HashMap;
import java.util.Map;

public class UniqueWordAbbreviation {
    Map<String, Integer> map = new HashMap<>();

    public UniqueWordAbbreviation(String[] tmp) {
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].length() <= 2)
                map.put(tmp[i], 1);
            else
                map.put("" + tmp[i].charAt(0) + (tmp.length - 2) + tmp[i].charAt(tmp.length - 1), 1);
        }
    }

    public static void main(String[] args) {

    }

    public boolean isUnique(String str) {
        return !map.containsKey(str);
    }

}
