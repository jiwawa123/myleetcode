package com.ji.algo.LCP;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/11/12:00
 */
public class L0611_1 {
    public static void main(String[] args) {
        System.out.println(isFascinating(267));
    }

    public static boolean isFascinating(int n) {
        int f = n * 2, s = n * 3;
        String str = n + "" + f + "" + s;
        Set<Character> set = new HashSet<>();
        if(str.length()!=9){
            return false;
        }

        for (char a : str.toCharArray()
        ) {
            if(a>='1'&&a<='9'){
                set.add(a);
            }

        }
        return set.size() == 9;
    }
}
