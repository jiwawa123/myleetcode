package com.ji.algo.G0531;

import org.omg.CORBA.MARSHAL;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * user ji
 * data 2020/5/31
 * time 11:36 上午
 */
public class G5 {
    public static void main(String[] args) {
        String res = "00110110";
        System.out.println(hasAllCodes(res, 2));
    }

    public static boolean hasAllCodes(String s, int k) {
        if (s.length() < k)
            return false;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length()-k; i++) {
            set.add(s.substring(i, i + k));
        }

        return set.size()== (int)(Math.pow(2,k));
    }
}
