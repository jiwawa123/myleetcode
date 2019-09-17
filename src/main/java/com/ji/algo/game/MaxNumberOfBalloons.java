package com.ji.algo.game;/*
    user ji
    data 2019/9/15
    time 10:30 AM
*/

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBalloons {
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }

    public static int maxNumberOfBalloons(String text) {
        if (text == null || text.length() < 7)
            return 0;
        char balloon[] = {'a', 'b', 'l', 'o', 'n'};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < balloon.length; i++) {
            map.put(balloon[i], 0);
        }
        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            }
        }
        int res = Integer.MAX_VALUE;
        for (char a : map.keySet()
                ) {
            if (a == 'l' || a == 'o') {
                res = Math.min(res, map.get(a) / 2);
            } else {
                res = Math.min(res, map.get(a));
            }
        }
        return res;
    }

}
