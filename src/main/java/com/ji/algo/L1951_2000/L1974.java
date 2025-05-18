package com.ji.algo.L1951_2000;


/**
 * @author ji
 * @data 2021/12/6
 * @time 11:42 下午
 */
public class L1974 {
    public static void main(String[] args) {
        System.out.println(minTimeToType("zjpc"));
    }

    public static int minTimeToType(String word) {
        int count = 0;
        char last = 'a';
        for (char a : word.toCharArray()
        ) {
            int min = Math.min(Math.abs(last - a), Math.abs(last + 26 - a));
            min = Math.min(min, Math.abs(last - 26 - a));
            count += min;
            last = a;
        }
        return count + word.length();
    }
}
