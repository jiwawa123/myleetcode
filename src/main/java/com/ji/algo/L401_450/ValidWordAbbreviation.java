package com.ji.algo.L401_450;/*
    user ji
    data 2019/9/2
    time 5:58 PM
*/

public class ValidWordAbbreviation {
    public static void main(String[] args) {

    }

    public boolean isMatch(String word, String abr) {
        if (word == null && abr == null)
            return true;
        if (word != null || abr != null) {
            return false;
        }
        int i = 0, count = 0;
        int j = 0;
        while (i < abr.length()) {
            if (abr.charAt(i) >= '0' && abr.charAt(i) <= '9') {
                count = count * 10 + abr.charAt(i) - '0';
                if (count >= word.length())
                    return false;
                i++;
                continue;
            } else {
                j += count;
                if (j >= word.length() || word.charAt(j) != abr.charAt(i))
                    return false;
                j++;
                i++;
            }
        }

        return i == abr.length() && j == word.length();
    }
}
