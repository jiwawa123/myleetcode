package com.ji.algo.L2101_2150;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/09/下午8:48
 */
public class L5960 {
    public static void main(String[] args) {

    }

    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        StringBuilder sp = new StringBuilder();
        for (String s : arr) {
            char[] tmp = s.toLowerCase().toCharArray();
            if (tmp.length > 2) {
                tmp[0] -= 32;
            }
            sp.append(String.valueOf(tmp));
            sp.append(" ");
        }


        return sp.toString().trim();
    }
}
