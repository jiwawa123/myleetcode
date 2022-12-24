package com.ji.algo.L2451_2500;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/12/23/下午7:54
 */
public class L2491 {
    public static void main(String[] args) {

    }

    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long res = 0;
        int i = 0, j = skill.length - 1, sum = -1;
        while (i < j) {
            int s = skill[i] + skill[j];
            if (sum == -1) {
                sum = s;
            } else if (sum != s) {
                return -1;
            }
            res += (skill[i] * skill[j]);
            i++;
            j--;

        }
        return res;
    }
}
