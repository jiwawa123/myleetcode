package com.ji.ready202309;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/04/18:35
 */
public class L66 {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        LinkedList<Integer> list = new LinkedList<>();
        int now = 0;
        for (int i = 0; i < digits.length; i++) {
            int tmp = (now + digits[digits.length - 1 - i]) % 10;
            now = (now + digits[digits.length - 1 - i]) / 10;
            list.addFirst(tmp);
        }
        if (now > 0) {
            list.addFirst(now);
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
