package com.ji.algo.L601_650;/*
    user ji
    data 2019/6/7
    time 9:38 AM
*/

import java.util.ArrayList;
import java.util.List;

public class SovleEquation {
    public static void main(String[] args) {
        System.out.println(solveEquation("-x=-1"));
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
    }

    public static String solveEquation(String equation) {
        int left_sum = 0;
        int left_x = 0;
        int right_sum = 0;
        int right_x = 0;
        String str[] = equation.split("=");
        int i = 0, j = 0;
        int tmp = 0;
        boolean flag = true;
        int symbol = 1;
        //开始计算左边
        while (i < str[0].length()) {
            if (str[0].charAt(i) == 'x') {
                if (i > 0 && (str[0].charAt(i - 1) != '+' && str[0].charAt(i - 1) != '-')) {

                } else {
                    tmp = 1;
                }
                symbol = flag ? 1 : -1;
                left_x += tmp * symbol;
                tmp = 0;
                i++;
                continue;
            }
            if (str[0].charAt(i) == '+' || str[0].charAt(i) == '-') {
                symbol = flag ? 1 : -1;
                left_sum += tmp * symbol;
                if (str[0].charAt(i) == '+') {
                    flag = true;
                } else {
                    flag = false;
                }
                i++;
                tmp = 0;
                continue;
            }
            tmp = tmp * 10 + Integer.valueOf(str[0].charAt(i) + "");
            i++;
        }
        if (tmp != 0) {
            symbol = flag ? 1 : -1;
            left_sum += tmp * symbol;
            tmp = 0;
            symbol = 1;
            flag = true;
        }
        symbol = 1;
        flag = true;
        //开始计算右边
        i = 0;
        while (i < str[1].length()) {
            if (str[1].charAt(i) == 'x') {
                if (i > 0 && (str[1].charAt(i - 1) != '+' || str[1].charAt(i - 1) != '-')) {
                } else {
                    tmp = 1;
                }
                symbol = flag ? 1 : -1;
                right_x += tmp * symbol;
                symbol = 1;
                tmp = 0;
                i++;
                continue;
            }
            if (str[1].charAt(i) == '+' || str[1].charAt(i) == '-') {
                symbol = flag ? 1 : -1;
                right_sum += tmp * symbol;
                if (str[1].charAt(i) == '+') {
                    flag = true;
                } else {
                    flag = false;
                }
                tmp = 0;
                i++;
                continue;
            }
            tmp = tmp * 10 + Integer.valueOf(str[1].charAt(i) + "");
            i++;
        }
        if (tmp != 0) {
            symbol = flag ? 1 : -1;
            right_sum += tmp * symbol;
            tmp = 0;
            symbol = 1;
            flag = true;
        }
        if (left_x == right_x) {
            if (left_sum == right_sum) {
                return "Infinite solutions";
            } else {
                return "No solution";
            }
        } else {
            int tmp_ = left_x - right_x;
            return "x=" + (right_sum - left_sum) / tmp_;
        }
    }

}
