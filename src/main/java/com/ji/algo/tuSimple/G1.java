package com.ji.algo.tuSimple;

/**
 * user ji
 * data 2020/8/4
 * time 1:49 下午
 */

import java.util.Scanner;
import java.util.*;

public class G1 {
    static List<String> list = new ArrayList();

    public static void main(String[] args) {
        createIpList("225224223221");
        for (String str : list) {
            System.out.println(str);
        }
    }

    public static void createIpList(String str) {
        if (str.length() < 4 || str.length() > 12) {
            return;
        }
        help(str, "", 0, 0);
    }

    public static void help(String str, String res, int start, int count) {
        if (start == str.length() && count == 4) {
            list.add(res);
            return;
        }
        if (start >= str.length()) {
            return;
        }

        if (count > 4) {
            return;
        }
        int tmp = 0;

        for (int i = start; i < str.length(); i++) {
            tmp = tmp * 10 + str.charAt(i) - '0';
            if (tmp < 256) {
                String next = res;
                if (next.equals("")) {
                    next += tmp;
                } else {
                    next += "." + tmp;
                }
                help(str, next, i + 1, count + 1);
            }

        }
    }

}
