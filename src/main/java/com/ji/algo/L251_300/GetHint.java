package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 10:34 PM
*/

import java.util.HashMap;
import java.util.Map;

public class GetHint {
    public static void main(String[] args) {

    }

    public String getHint(String secret, String guess) {
        boolean flag[] = new boolean[secret.length()];
        int a = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                flag[i] = true;
                a++;
            } else {
                map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0) + 1);
            }
        }
        int b = 0;
        for (int i = 0; i < guess.length(); i++) {
            if (flag[i])
                continue;
            if (map.getOrDefault(guess.charAt(i), 0) > 0) {
                b++;
                map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
            }
        }
        return a + "A" + b + "B";
    }
}
