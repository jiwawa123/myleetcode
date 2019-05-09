package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/9
    time 10:20 PM
*/

public class DetectCapitalUse {
    public static void main(String[] args) {

    }

    public boolean detectCapitalUse(String word) {
        if (null == word || word.length() < 2)
            return true;
        String t1 = word.toLowerCase();
        String t2 = word.toUpperCase();
        if(t1.equals(word)||t2.equals(word))
            return true;
        String tmp = word.substring(1,word.length());
        return tmp.equals(word.substring(1,word.length()));
    }
}
