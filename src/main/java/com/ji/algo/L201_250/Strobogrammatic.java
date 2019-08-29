package com.ji.algo.L201_250;/*
    user ji
    data 2019/8/29
    time 10:51 PM
*/

import java.util.HashMap;
import java.util.Map;

public class Strobogrammatic {
    public static void main(String[] args) {

    }

    public boolean isStrobogrammaticNumber(int number) {
        Map<Character, Character> map = new HashMap();
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');
        map.put('1', '1');
        map.put('0', '0');
        char tmp[] = (number + "").toCharArray();
        int i = 0, j = tmp.length - 1;
        while (i < j) {
            if (map.containsKey(tmp[i]) && map.get(tmp[i]) == tmp[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
