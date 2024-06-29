package com.ji.algo.L3001_3050;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/14/16:59
 */
public class G0414 {
    public static void main(String[] args) {
        System.out.println(findLatestTime("??:1?"));
    }

    public static String findLatestTime(String s) {
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            switch (s.charAt(i)) {
                case '?':
                    if (i == 0) {
                        if (s.charAt(1) >= '2' && s.charAt(1) != '?') {
                            sp.append('0');
                        } else {
                            sp.append('1');
                        }
                        continue;
                    }
                    if (i == 1) {
                        if (sp.charAt(0) == '1') {
                            sp.append('1');
                        } else {
                            sp.append('9');
                        }
                    }

                    if (i == 3) {
                        sp.append('5');
                    }

                    if (i == 4) {
                        sp.append('9');
                    }


                    break;
                default:
                    sp.append(s.charAt(i));
                    break;
            }
        }
        return sp.toString();
    }
}
