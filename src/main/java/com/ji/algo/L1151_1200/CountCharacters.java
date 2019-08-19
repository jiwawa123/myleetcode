package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/8/19
    time 1:11 PM
*/

public class CountCharacters {
    public static void main(String[] args) {

    }

    public int countCharacters(String[] words, String chars) {
        int arr[] = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            arr[chars.charAt(i) - 'a'] += 1;
        }
        int count = 0;
        for (String word : words
                ) {
            int tmp[] = new int[26];
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                tmp[word.charAt(i) - 'a'] += 1;
                if (tmp[word.charAt(i) - 'a'] > arr[word.charAt(i) - 'a']) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count += word.length();
        }
        return count;
    }
}
