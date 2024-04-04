package com.ji.algo.L3051_L3100;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/01/16:35
 */
public class L3100 {
    public static void main(String[] args) {

    }

    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum = numBottles;
        while (numBottles >= numExchange) {
            sum++;
            numBottles -= numExchange;
            numBottles++;
            numExchange++;
        }
        return sum;
    }

}
