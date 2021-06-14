package com.ji.algo.L1851_1900;

/**
 * user ji
 * data 2021/6/4
 * time 7:04 下午
 */
public class L1880 {
    public static void main(String[] args) {

    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for (int i = 0; i < firstWord.length(); i++) {
            num1 += num1 * 10 + firstWord.charAt(i) - 'a';
        }
        for (int i = 0; i < secondWord.length(); i++) {
            num2 += num2 * 10 + secondWord.charAt(i) - 'a';
        }
        for (int i = 0; i < targetWord.length(); i++) {
            num3 += num3 * 10 + targetWord.charAt(i) - 'a';
        }

        return num3 == num1 + num2;
    }
}
