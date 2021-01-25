package com.ji.algo.G0125;

/**
 * user ji
 * data 2021/1/25
 * time 9:49 上午
 */
public class MaxTime {
    public static void main(String[] args) {
        System.out.println(maximumTime("1?:22"));
    }

    public static String maximumTime(String time) {
        char[] tmp = time.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] != '?' || tmp[i] == ':')
                continue;
            if (i == 0) {
                if (tmp[i + 1] <= '3' || tmp[i + 1] == '?') {
                    tmp[i] = '2';
                } else {
                    tmp[i] = '1';
                }
            }

            if (i == 1) {
                if (tmp[i - 1] != '2' || tmp[i - 1] == '?') {
                    tmp[i] = '9';
                } else {
                    tmp[i] = '3';
                }
            }

            if (i == 3) {
                tmp[i] = '5';
            }

            if (i == 4) {
                tmp[i] = '9';
            }
        }
        return String.valueOf(tmp);
    }
}
