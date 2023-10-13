package com.ji.ready202309;

import com.ji.algo.game.G0217.L;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/12:35
 */
public class L22 {
    public static void main(String[] args) {
        L22 l22 = new L22();
        generateParenthesis(1);
    }

    List<String> res = new LinkedList<>();

    public static List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        help(result, 0, 0, "", n);
        return result;
    }

    public static void help(List<String> res, int left, int right, String tmp, int n) {
        if (right > left || left > n)
            return;
        if (left == right && left == n) {
            res.add(tmp);
            return;
        }
        help(res, left + 1, right, tmp + "(", n);
        help(res, left, right + 1, tmp + ")", n);
    }
}
