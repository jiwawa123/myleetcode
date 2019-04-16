package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/16
    time 2:37 PM
*/

public class CompareVersion {
    public static void main(String[] args) {
        compareVersion("0.1","1.1");
    }

    public static int compareVersion(String version1, String version2) {
        String s1[] = version1.split("\\.");
        String s2[] = version1.split("\\.");
        int i = 0, j = 0;
        while (i < s1.length && j < s2.length) {
            int int1 = Integer.valueOf(s1[i++]);
            int int2 = Integer.valueOf(s2[j++]);
            if (int1 == int2)
                continue;
            if (int1 > int2) {
                return 1;
            } else
                return -1;
        }

        while (i < s1.length) {
            int tmp = Integer.valueOf(s1[i++]);
            if(tmp==0)
                continue;
            return 1;
        }
        while (j<s2.length){
            int tmp = Integer.valueOf(s2[j++]);
            if(tmp==0)
                continue;
            return -1;
        }
        return 0;
    }
}
