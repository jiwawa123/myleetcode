package com.ji.algo.G0404;

/**
 * user ji
 * data 2021/4/4
 * time 10:07 下午
 */
public class AreSentencesSimilar {
    public static void main(String[] args) {

    }

    public boolean areSentencesSimilar(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        if (words1.length < words2.length) {
            return areSentencesSimilar(s2, s1);
        }

        int index = -1, j = 0;
        int len1 = words1.length, len2 = words2.length;
        for (int i = 0; i < len1; i++) {
            if (j < len2 && words2[j].equals(words1[i])) {
                j++;
            } else {
                if (index >= 0 && i - index > 1) {
                    return false;
                }
                index = i;
            }
        }

        return j == len2;
    }
}
