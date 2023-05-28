package com.ji.algo.L2651_2700;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/22/21:33
 */
public class L2692 {
    public static void main(String[] args) {

    }

    public int minLength(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            s = s.replaceAll("AB","");
            s = s.replaceAll("CD","");
        }
        return s.length();
    }
}
