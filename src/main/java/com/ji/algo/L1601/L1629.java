package com.ji.algo.L1601;

/**
 * user ji
 * data 2020/10/27
 * time 6:29 下午
 */
public class L1629 {
    public static void main(String[] args) {

    }

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = 0;
        char c = ' ';
        for (int i = 0; i < releaseTimes.length; i++) {
            int len = i > 0 ? releaseTimes[i - 1] : 0;
            int gap = releaseTimes[i] - len;
            if (max < gap) {
                c = keysPressed.charAt(i);
                max = gap;
            }
            if (max == gap) {
                c = c > keysPressed.charAt(i) ? c : keysPressed.charAt(i);
            }

        }
        return c;
    }
}
