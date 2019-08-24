package com.ji.algo.L401_450;/*
    user ji
    data 2019/8/24
    time 8:27 PM
*/

public class CharacterReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABBB", 2));
    }

    public static int characterReplacement(String text, int k) {
        int min = 0;
        if (text == null || text.length() == 0)
            return min;
        for (int i = 0; i < text.length(); i++) {
            if (text.length() - i < min)
                break;
            char a = text.charAt(i);
            int l = 1;
            int d = 0;
            for (int j = i + 1; j < text.length(); j++) {
                if (a == text.charAt(j)) {
                    l++;
                } else {
                    d++;
                    if (d > k) {
                        break;
                    }
                }
            }
            int pre = Math.max(Math.min(i, k - d), 0);
            d = Math.min(k, d);
            min = Math.max(min, pre + l + d);
        }
        return min;
    }
}
