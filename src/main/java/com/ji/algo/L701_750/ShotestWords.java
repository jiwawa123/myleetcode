package com.ji.algo.L701_750;/*
    user ji
    data 2019/5/12
    time 6:46 PM
*/

import java.util.Arrays;
import java.util.Comparator;

public class ShotestWords {
    public static void main(String[] args) {

    }

    public String shortestCompletingWord(String licensePlate, String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (int i = 0; i < words.length; i++) {
            if(match(words[0],licensePlate))
                return words[0];
        }
        return null;
    }

    public boolean match(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int arr[] = new int[26];
        for (int i = 0; i < str2.length(); i++) {
            arr[str2.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                if (arr[str1.charAt(i)] > 0) {
                    arr[str1.charAt(i)] -= 1;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
