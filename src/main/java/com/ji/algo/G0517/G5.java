package com.ji.algo.G0517;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/5/17
 * time 6:48 下午
 */
public class G5 {
    public static void main(String[] args) {

    }

    public List<String> simplifiedFractions(int n) {
        List<String> res = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (isMatch(i, j) == 1) {
                    res.add(j + "/" + i);
                }
            }
        }
        return res;
    }

    public int isMatch(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
