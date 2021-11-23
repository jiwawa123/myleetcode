package com.ji.algo.L2001_2050;

/**
 * @author ji
 * @data 2021/11/23
 * @time 10:27 下午
 */
public class L2042 {
    public static void main(String[] args) {
        System.out.println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
    }

    public static boolean areNumbersAscending(String s) {
        int last = 0;
        int tmp = 0;
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) >= '0' && arr[i].charAt(0) <= '9') {
                tmp = Integer.valueOf(arr[i]);
                if (tmp <= last)
                    return false;
                last = tmp;
            }
        }
        return true;
    }

}
