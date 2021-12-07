package com.ji.algo.L2001_2050;

/**
 * @author ji
 * @data 2021/12/6
 * @time 11:16 下午
 */
public class L2047 {
    public static void main(String[] args) {
        System.out.println(new L2047().countValidWords("he bought 2 pencils, 3 erasers, and 1  pencil-sharpener."));
    }

    public int countValidWords(String sentence) {
        String[] arr = sentence.trim().split(" ");
        int count = 0;
        for (String s : arr) {
            if (isValidWords(s)) {
                count++;
            }
        }
        return count;
    }

    public boolean isValidWords(String word) {
        word = word.trim();
        if (word.length() == 0)
            return false;
        if (word.endsWith("!") || word.endsWith(",") || word.endsWith(".")) {
            if (word.length() == 1)
                return true;
            word = word.substring(0, word.length() - 1);
        }
        if (word.startsWith("-") || word.endsWith("-"))
            return false;
        String[] arr = word.split("-");
        if(arr.length>2)
            return false;
        for (String s:arr
             ) {
            if(!noNumber(s))
                return false;
        }
        return true;
    }

    public boolean noNumber(String word) {
        if (word.length() == 0) {
            return false;
        }

        return noNumberI(word);
    }

    public boolean noNumberI(String word) {
        for (char a : word.toCharArray()
        ) {
            if (a >= '0' && a <= '9')
                return false;
            if (a == '!' || a == '.' || a == ',')
                return false;
        }
        return true;
    }
}
