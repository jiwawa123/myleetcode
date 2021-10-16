package com.ji.algo.L1951_2000;

/**
 * @author ji
 * @data 2021/8/29
 * @time 9:05 下午
 */
public class L1967 {
    public static void main(String[] args) {

    }

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern))
                count++;
        }
        return count;
    }
}
