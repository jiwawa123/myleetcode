package com.ji.algo.L2351_2400;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/06/下午9:37
 */
public class L2391 {
    public static void main(String[] args) {
        String[] arr = {"MMM", "PGM", "GP"};
        int[] array = {3, 10};
        System.out.println(garbageCollection(arr, array));
    }

    public static int garbageCollection(String[] garbage, int[] travel) {
        int res = 0;
        int[] index = new int[3];
        Arrays.fill(index, 0);
        for (int i = 0; i < garbage.length; i++) {
            int[] tmp = new int[3];
            for (int j = 0; j < garbage[i].length(); j++) {
                switch (garbage[i].charAt(j)) {
                    case 'M':
                        tmp[0]++;
                        break;
                    case 'P':
                        tmp[1]++;
                        break;
                    case 'G':
                        tmp[2]++;
                        break;
                }
            }
            for (int j = 0; j < 3; j++) {
                if (tmp[j] > 0) {
                    if (i > 0) {
                        res += tmp[j] + travel[i - 1] + index[j];
                    } else {
                        res += tmp[j] + index[j];
                    }
                    index[j] = 0;
                } else {
                    if (i > 0) {
                        index[j] += travel[i - 1];
                    }

                }
            }
            System.out.println(res);
        }
        return res;
    }
}
