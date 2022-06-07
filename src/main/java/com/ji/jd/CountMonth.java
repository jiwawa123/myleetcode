package com.ji.jd;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2022/05/13/上午11:33
 */
public class CountMonth {
    public static void main(String[] args) {
        List<String> res = count(2021, 1, 2022, 12);
        res.forEach(System.out::println);
    }

    public static List<String> count(int year1, int month1, int year2, int month2) {
        List<String> res = new ArrayList<>();
        int j = month1;
        int i = year1;
        while (i < year2) {
            while (j <= 12) {
                res.add("" + year1 + j);
                j++;
            }
            j = 1;
            i++;
        }
        while (j <= month2) {
            res.add("" + year2 + j++);
        }
        return res;
    }
}
