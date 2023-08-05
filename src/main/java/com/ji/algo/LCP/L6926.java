package com.ji.algo.LCP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/23/11:27
 */
public class L6926 {
    public static void main(String[] args) {
        String str = "AaEeIiOoUu";
        for (char a : str.toCharArray()) {
            System.out.println(a + " " + (a - 'A'));
        }
        System.out.println(sortVowels("lEetcOde"));
    }

    public static String sortVowels(String s) {
        int[] arr = new int[10];
        String str = "AEIOUaeiou";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), i);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                arr[map.get(s.charAt(i))]++;
            }
        }
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                for (int j = 0; j < 10; j++) {
                    if (arr[j] > 0) {
                        arr[j]--;
                        sp.append(str.charAt(j));
                        break;
                    }
                }
            } else {
                sp.append(s.charAt(i));
            }
        }

        return sp.toString();

    }
}
