package com.ji.algo.L2401_2450;

/**
 * @Author: Bei Chang
 * @Date: 2022/10/21/下午9:20
 */
public class L2437 {
    public static void main(String[] args) {

    }

    public int countTime(String time) {
        if (!time.contains("?")) {
            return 1;
        }
        int a = 1, b = 1;
        char h1 = time.charAt(0), h2 = time.charAt(1),
                m1 = time.charAt(3), m2 = time.charAt(4);
        // 判断小时
        if (h1 == '?') {
            if (h2 == '?') {
                a = 24;
            } else {
                Integer hh2 = Integer.parseInt(h2 + "");
                if (hh2 < 4) {
                    a = 3;
                } else {
                    a = 2;
                }
            }
        } else {
            if (h2 == '?') {
                Integer hh1 = Integer.parseInt(h1 + "");
                if (hh1 < 2) {
                    a = 10;
                } else {
                    a = 4;
                }
            }
        }
        // 判断分钟
        if (m1 == '?') {
            if (m2 == '?') {
                b = 60;
            } else {
                b = 6;

            }
        } else {
            if (m2 == '?') {
                b = 10;
            }
        }
        return a * b;
    }
}
