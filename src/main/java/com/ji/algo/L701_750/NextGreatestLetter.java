package com.ji.algo.L701_750;/*
    user ji
    data 2019/5/30
    time 10:31 PM
*/

public class NextGreatestLetter {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target)
                return letters[i];
        }
        return letters[0];
    }
}
