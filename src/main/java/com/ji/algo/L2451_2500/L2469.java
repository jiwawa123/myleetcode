package com.ji.algo.L2451_2500;

/**
 * @Author: Bei Chang
 * @Date: 2022/11/21/上午9:40
 */
public class L2469 {
    public static void main(String[] args) {

    }

    public double[] convertTemperature(double celsius) {
        double[] res = new double[2];
        res[0] = celsius + 273.15;
        res[1] = celsius * 1.80 + 32.00;
        return res;
    }
}
