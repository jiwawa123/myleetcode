package com.ji.algo.L2451_2500;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2022/11/13/下午9:26
 */
public class L2452 {
    public static void main(String[] args) {

    }

    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res = new LinkedList<>();
        for (String str : queries
        ) {
            boolean flag = false;
            for (String dic : dictionary
            ) {
                if (isMatch(str, dic)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                res.add(str);
            }
        }
        {

        }
        return res;
    }

    public boolean isMatch(String a1, String a2) {
        int count = 0;
        for (int i = 0; i < a1.length(); i++) {
            if (a1.charAt(i) != a2.charAt(i)) {
                count++;
                if (count > 2) {
                    return false;
                }
            }
        }
        return count <= 2;
    }
}
