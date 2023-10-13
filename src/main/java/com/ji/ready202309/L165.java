package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/14:19
 */
public class L165 {
    public static void main(String[] args) {
        compareVersion("1.0.1", "1");
    }

    public static int compareVersion(String version1, String version2) {
        String[] a1 = version1.split("\\.");
        String[] a2 = version2.split("\\.");

        int i = 0, j = 0;
        for (; i < a1.length & j < a2.length; i++, j++) {
            long v1 = Long.valueOf(a1[i]);
            long v2 = Long.valueOf(a2[i]);
            if (v1 > v2) {
                return 1;
            }
            if (v1 < v2) {
                return -1;
            }
        }
        for (; i < a1.length; i++) {
            long v1 = Long.valueOf(a1[i]);
            if (v1 > 0) {
                return 1;
            }
        }

        for (; j < a2.length; j++) {
            long v1 = Long.valueOf(a2[j]);
            if (v1 > 0) {
                return -1;
            }
        }


        return 0;
    }
}
