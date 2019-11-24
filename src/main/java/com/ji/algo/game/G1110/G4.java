package com.ji.algo.game.G1110;/*
    user ji
    data 2019/11/10
    time 10:29 AM
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class G4 {
    public static void main(String[] args) {

    }

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int res = 0;
        int[] lc = new int[26];
        for (char c : letters) {
            ++lc[c - 'a'];
        }
        int[] wordValue = new int[16];
        int[][] wordCost = new int[16][26];
        int idx = 0;
        for (String s : words) {
            int len = s.length();
            for (int i = 0; i < len; i++) {
                int chIdx = s.charAt(i) - 'a';
                wordValue[idx] += score[chIdx];
                wordCost[idx][chIdx]++;
            }

            for (int i = 0; i < 26; i++) {
                if (wordCost[idx][i] > lc[i]) {
                    wordValue[idx] = 0;
                }
            }
            idx++;
        }

        int upper = (1 << words.length) - 1;
        int[] used = new int[26];
        for (int i = 1; i <= upper; i++) {
            int thisScore = 0;
            Arrays.fill(used, 0);
            for (int w = 0; w < words.length; w++) {
                if ((i & (1 << w)) != 0) {
                    boolean over = false;
                    for (int c = 0; c < 26; c++) {
                        used[c] += wordCost[w][c];
                        if (used[c] > lc[c]) {
                            over = true;
                            break;
                        }
                    }
                    if (!over) {
                        thisScore += wordValue[w];
                        res = Math.max(thisScore, res);
                    } else {
                        break;
                    }
                }
            }
        }

        return res;
    }
}
