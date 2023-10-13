package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/07/19:51
 */
public class L1208 {
    public static void main(String[] args) {

    }

    public int equalSubstring(String s, String t, int maxCost) {
        int res = 0;
        int cost = 0;
        for (int right = 0, left = 0; right < s.length(); ) {
            cost += Math.abs(s.charAt(right) - 'A' - (t.charAt(right) - 'A'));
            right++;
            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(left) - 'A' - (t.charAt(left) - 'A'));
                left++;
            }
            res = Math.max(res, right - left);
        }

        return res;
    }
}
