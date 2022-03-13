package com.ji.algo.L2151_2200;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2022/03/13/下午7:13
 */
public class L2195 {
    public static void main(String[] args) {

    }

    public List<String> cellsInRange(String s) {
        int start = s.charAt(1) - '0';
        int end = s.charAt(4) - '0';
        char r = s.charAt(0), c = s.charAt(3);
        List<String> res = new LinkedList<>();
        for (int i = 0; i <= c - r; i++) {
            for (int j = 0; j <= end - start; j++) {
                res.add((char) (r + i) + "" + (start + j));
            }
        }
        return res;

    }
}
