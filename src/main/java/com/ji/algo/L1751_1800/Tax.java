package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/3/2
 * time 3:08 下午
 */
public class Tax {
    public static void main(String[] args) {
        System.out.println(getLast(0.22, 0.43, 21500, 21500 * 4));
    }

    public static double getLast(double rate_my, double rate_company, double base, double bonus) {
        double res = 30000.0;
        res += base * 12;
        res += 1250 * 12;
        res += bonus;
        System.out.println("you can get all " + res);
        double last = res - base * rate_my * 12 - 1500 * 12;
        double tax = 0;
        double tmp = last - 12 * 5000;
        double step[] = {960000, 660000, 420000, 300000, 144000, 36000, 0};
        double rate[] = {0.45, 0.35, 0.3, 0.25, 0.2, 0.1, 0.03};
        for (int i = 0; i < 6; i++) {
            if (tmp >= step[i]) {
                tax += (tmp - step[i]) * rate[i];
                tmp -= step[i];
            }
        }
        System.out.println("you need tax" + tax);
        return res;
    }
}
