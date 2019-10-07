package com.ji.algo.game;/*
    user ji
    data 2019/10/6
    time 5:05 PM
*/

import java.util.HashMap;
import java.util.Map;

public class CountVowelPermutation {
    public static void main(String[] args) {
        System.out.println(countVowelPermutation(144));
    }

    public static int countVowelPermutation(int n) {

        int max = (int) Math.pow(10, 9) + 7;
        Map<Character, Long> map = new HashMap<>();
        char[] tt = {'a', 'e', 'i', 'o', 'u'};
        for (char t : tt
                ) {
            map.put(t, 1L);
        }
        for (int i = 1; i < n; i++) {
            Map<Character, Long> tmp = new HashMap<>();
            for (char t : map.keySet()
                    ) {
                switch (t) {
                    case 'a':
                        tmp.put('e', (tmp.getOrDefault('e', 0L) % max + map.get('a') % max) % max);
                        break;
                    case 'e':
                        tmp.put('a', (tmp.getOrDefault('a', 0L) % max + map.get('e') % max) % max);
                        tmp.put('i', (tmp.getOrDefault('i', 0L) % max + map.get('e') % max) % max);
                        break;
                    case 'i':
                        tmp.put('a', (tmp.getOrDefault('a', 0L) % max + map.get('i') % max) % max);
                        tmp.put('e', (tmp.getOrDefault('e', 0L) % max + map.get('i') % max) % max);
                        tmp.put('o', (tmp.getOrDefault('o', 0L) % max + map.get('i') % max) % max);
                        tmp.put('u', (tmp.getOrDefault('u', 0L) % max + map.get('i') % max) % max);
                        break;
                    case 'o':
                        tmp.put('i', (tmp.getOrDefault('i', 0L) % max + map.get('o') % max) % max);
                        tmp.put('u', (tmp.getOrDefault('u', 0L) % max + map.get('o') % max) % max);
                        break;
                    case 'u':
                        tmp.put('a', (tmp.getOrDefault('a', 0L) % max + map.get('u') % max) % max);
                        break;
                }
            }
            map = tmp;
        }
        int count = 0;
        for (long l : map.values()
                ) {
            count += l % max;
            count %= max;
        }
        return count % max;
    }
}
