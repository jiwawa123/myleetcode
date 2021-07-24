package com.ji.algo.L1901_1950;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ji
 * @data 2021/7/24
 * @time 11:00 下午
 */
public class L1935 {
    public static void main(String[] args) {

    }

    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] arr = text.split(" ");
        Map<Character, Integer> map = new HashMap<>(26);
        for (int i = 0; i < brokenLetters.length(); i++) {
            map.put(brokenLetters.charAt(i), 0);
        }
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for (; j < arr[i].length(); j++) {
                if (map.containsKey(arr[i].charAt(j))) {
                    break;
                }
            }
            if (j == arr[i].length()) {
                count += 1;
            }
        }
        return count;
    }
}
