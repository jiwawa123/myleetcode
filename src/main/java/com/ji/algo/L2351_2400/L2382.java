package com.ji.algo.L2351_2400;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/01/上午8:33
 */
public class L2382 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        int[] arr1 = {1, 1, 1, 50};
        System.out.println(minNumberOfHours(1, 1, arr, arr1));
    }

    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int res = 0;
        for (int i = 0; i < energy.length; i++) {
            if (initialEnergy <= energy[i]) {
                res += energy[i] - initialEnergy + 1;
                initialEnergy = 1;
            } else {
                initialEnergy -= energy[i];
            }
            if (initialExperience <= experience[i]) {
                res += experience[i] - initialExperience + 1;
                initialExperience += experience[i] + 1;
            } else {
                initialExperience += experience[i];
            }
        }
        return res;
    }
}
