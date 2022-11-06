package com.ji.algo.L2451_2500;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2022/11/06/上午10:56
 */
public class L2451 {
    public static void main(String[] args) {
        String arr[] = {"abm", "bcn", "alm"};
        System.out.println(oddString(arr));
    }

    public static String oddString(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sp = new StringBuilder();
            for (int j = 1; j < words[i].length(); j++) {
                int m = words[i].charAt(j) - words[i].charAt(j - 1);
                sp.append(m+"_");
            }

            if (map.containsKey(sp.toString())) {
                map.get(sp.toString()).add(words[i]);
            } else {
                List<String> set = new LinkedList<>();
                set.add(words[i]);
                map.put(sp.toString(), set);
            }
        }
        for (List<String> set : map.values()
        ) {
            if (set.size() == 1) {
                return set.get(0);
            }
        }
        return null;
    }
}
