package com.ji.algo.L2401_2450;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/18/下午12:34
 */
public class L6185 {
    public static void main(String[] args) {

    }

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0, j = 0;
        int res = 0;
        while (i < players.length && j < trainers.length) {
            if (players[i] <= trainers[j]) {
                i++;
                j++;
                res++;
                continue;
            } else if (players[i] > trainers[j]) {
                j++;
            }
        }
        return res;

    }
}
