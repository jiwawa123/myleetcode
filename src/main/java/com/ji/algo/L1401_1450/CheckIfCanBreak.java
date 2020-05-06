package com.ji.algo.L1401_1450;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * user ji
 * data 2020/5/4
 * time 2:48 下午
 */
public class CheckIfCanBreak {
    public static void main(String[] args) {
        System.out.println(checkIfCanBreak("abc", "xya"));
    }

    public static boolean checkIfCanBreak(String s1, String s2) {
        char[] as1 = s1.toCharArray();
        char[] as2 = s2.toCharArray();
        Arrays.sort(as1);
        Arrays.sort(as2);
        boolean flag = true;
        for (int i = 0; i < s1.length(); i++) {
            if (as1[i] > as2[i]) {
                flag = false;
                break;
            }
        }
        if (flag)
            return flag;
        flag = true;
        for (int i = 0; i < s1.length(); i++) {
            if (as1[i] < as2[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
