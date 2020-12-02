package com.ji.algo.G1130;

/**
 * user ji
 * data 2020/11/30
 * time 8:55 下午
 */
public class G {
    public static void main(String[] args) {

    }

    public int maxRepeating(String sequence, String word) {
        String sp = word;
        int count = 0;
        while (sequence.contains(sp)) {
            count++;
            sp += word;
        }
        return count;
    }
}
