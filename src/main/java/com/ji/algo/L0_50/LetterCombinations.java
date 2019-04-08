package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/8
    time 12:03 PM
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterCombinations {
    public static void main(String[] args) {
        letterCombinations("23");
    }
    //使用空间换时间的做法，直接使用从前到后开始遍历，中间维持两个list即可
    public static List<String> letterCombinations(String digits) {
        if(null==digits||digits.length()==0)
            return null;
        char[][] temp;
        temp = new char[][]{
                {},
                {},
                {'a','b','c'},
                {'d','e','f'},
                {'g','h','i'},
                {'j','k','l'},
                {'m','n','o'},
                {'p','q','r','s'},
                {'t','u','v'},
                {'w','x','y','z'}
        };
        Set<String> answer = new HashSet<>();
        List<String> tmp = new ArrayList<>();
        tmp.add("");
        for (int i = 0; i < digits.length(); i++) {
            answer = new HashSet<>();
            if(digits.charAt(i)-'0'<=1)
                continue;
            char letter[] = temp[digits.charAt(i)-'0'];
            for (int j = 0; j < letter.length; j++) {
                for (int k = 0; k < tmp.size(); k++) {
                    answer.add(tmp.get(k)+letter[j]);
                }
            }
            tmp = new ArrayList<>(answer);

        }
        return new ArrayList<>(answer);
    }
}
