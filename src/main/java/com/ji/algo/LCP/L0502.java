package com.ji.algo.LCP;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/18/21:10
 */
public class L0502 {
    public static void main(String[] args) {
        System.out.println(printBin(0.625));
    }

    public static String printBin(double num) {
        StringBuilder sp = new StringBuilder();
        sp.append("0.");
        while (num != 0 && sp.length() < 32) {
            num *= 2;
            if (num >= 1) {
                sp.append("1");
                num -= 1;
            } else {
                sp.append("0");
            }
        }
        if (num == 0) {
            return sp.toString();
        }
        return "ERROR";
    }
}
