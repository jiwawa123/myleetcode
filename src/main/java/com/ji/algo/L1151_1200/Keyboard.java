package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/8/28
    time 1:44 PM
*/

public class Keyboard {
    public static void main(String[] args) {

    }

    public int getDistance(String keyboard, String word) {
        int arr[] = new int[26];
        for (int i = 0; i < keyboard.length(); i++) {
            arr[keyboard.charAt(i) - 'a'] = i;
        }
        int tmp = 0;
        int need = 0;
        for (int i = 0; i < word.length(); i++) {
            need += Math.abs(arr[word.charAt(i) - 'a'] - tmp);
            tmp = arr[word.charAt(i) - 'a'];
        }
        return need;
    }
}
