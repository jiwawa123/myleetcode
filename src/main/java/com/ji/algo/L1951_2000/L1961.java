package com.ji.algo.L1951_2000;

/**
 * @author ji
 * @data 2021/12/6
 * @time 11:35 下午
 */
public class L1961 {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] arr = {"apples", "i", "love", "leetcode"};
        System.out.println(isPrefixString(s, arr));

    }

    public static boolean isPrefixString(String s, String[] words) {
        int index = 0;
        for (int i = 0; i < words.length && index < s.length(); i++) {
            if (words[i].length() > s.length() - index)
                return false;
            if (words[i].equals(s.substring(index, index + words[i].length())))
                index += words[i].length();
        }
        return true;
    }
}
