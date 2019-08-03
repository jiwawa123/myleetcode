package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/8
    time 9:30 AM
*/

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        int answer = 0;
        int index = 0;
        while (index < s.length()) {
            if (index + 2 <= s.length()) {
                if (map.containsKey(s.substring(index, index + 2))) {
                    answer += map.get(s.substring(index, index + 2));
                    index += 2;
                    continue;
                }
            }
            answer+=map.get(s.substring(index,index+1));
        }
        return answer;
    }
    public int romanToIntII(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int count = 0;
        int tmp = 0;
        int next = 0;
        for (int i = 0; i < s.length(); i++) {
            next = map.get(s.charAt(i));
            if (next <= tmp) {
                count += tmp;
            } else {
                count -= tmp;
            }
            tmp = next;
        }
        return count + tmp;
    }
}
