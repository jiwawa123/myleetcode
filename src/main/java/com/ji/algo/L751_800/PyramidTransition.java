package com.ji.algo.L751_800;/*
    user ji
    data 2019/7/26
    time 1:46 PM
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PyramidTransition {
    public static void main(String[] args) {

    }

    Map<String, List<String>> map = new HashMap<>();

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        return false;
    }

    public boolean help(String string) {
        if (string.length() == 1)
            return true;
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < string.length() - 1; i++) {
            if (map.containsKey(string.substring(i, i + 1))) ;
        }
        return false;
    }
}
