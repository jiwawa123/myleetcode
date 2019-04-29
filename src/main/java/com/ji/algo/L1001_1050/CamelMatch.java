package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/4/29
    time 8:01 PM
*/


import java.util.LinkedList;
import java.util.List;

public class CamelMatch {
    public static void main(String[] args) {

    }
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new LinkedList<>();
        int len = pattern.length();
        for (String query: queries) {
            boolean isValid = true;
            int currIndex = 0;
            for (int j = 0; j < query.length(); j++) {
                if (currIndex < len && pattern.charAt(currIndex) == query.charAt(j))
                    currIndex++;
                else if (Character.isUpperCase(query.charAt(j))) {
                    isValid = false;
                    break;
                }
            }
            res.add(isValid && len == currIndex ? true : false);
        }
        return res;
    }
}
