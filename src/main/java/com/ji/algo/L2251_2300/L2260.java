package com.ji.algo.L2251_2300;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/31/上午10:46
 */
public class L2260 {
    public static void main(String[] args) {

    }

    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> last = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < cards.length; i++) {
            if (last.containsKey(cards[i])) {
                min = Math.min(min,i-last.get(cards[i]));

            }
            last.put(cards[i], i);
        }
        return -1;
    }
}
