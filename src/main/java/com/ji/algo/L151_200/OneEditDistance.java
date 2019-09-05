package com.ji.algo.L151_200;/*
    user ji
    data 2019/9/5
    time 9:58 PM
*/

public class OneEditDistance {
    public static void main(String[] args) {

    }

    public boolean oneEditDistance(String word1, String word2) {
        if (word1 == null && word2 == null)
            return true;
        if (word1 == null || word2 == null)
            return false;
        if (Math.abs(word1.length() - word2.length()) > 2)
            return false;
        //如果长度相等的话就判断是不是可以使用小于一个
        if (word1.length() == word2.length()) {
            int count = 0;
            for (int i = 0; i < word1.length(); i++) {
                if (word1.charAt(i) != word2.charAt(i))
                    count++;
                if (count > 1)
                    return false;
            }
            return true;
        } else {
            if (word1.length() > word2.length()) {
                String tmp = word1;
                word1 = word2;
                word2 = tmp;
            }
            for (int i = 0; i < word1.length(); i++) {
                if (word1.charAt(i) != word2.charAt(i)) {
                    if (word2.substring(i + 1, word2.length()).equals(word1.substring(i, word1.length()))) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }

    }
}
