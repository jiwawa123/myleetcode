package com.ji.algo.L2551_2600;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/15/10:24
 */
public class L2579 {
    public static void main(String[] args) {
        System.out.println(splitNum(958351976));
    }

    public static int splitNum(int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            int t = num % 10;
            num /= 10;
            if (t != 0) {
                list.add(t);
            }
        }
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() == 2) {
            return list.get(0) + list.get(1);
        }

        Collections.sort(list);
        StringBuilder num1 = new StringBuilder();
        int i = 0;
        while (i < list.size()) {
            num1.append(list.get(i));
            i += 2;
        }
        i = 1;
        StringBuilder num2 = new StringBuilder();
        while (i < list.size()) {
            num2.append(list.get(i));
            i += 2;
        }
        System.out.println(num1.toString() + " " + num2.toString());

        return Integer.valueOf(num1.toString()) + Integer.valueOf(num2.toString());
    }
}
