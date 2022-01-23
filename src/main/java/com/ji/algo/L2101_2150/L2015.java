package com.ji.algo.L2101_2150;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/23/下午8:33
 */
public class L2015 {
    public static void main(String[] args) {
        int[] arr = {726, 739, 934, 116, 643, 648, 473, 984, 482, 85, 850, 806, 146, 764, 156,
                66, 186, 339, 985, 237, 662, 552, 800, 78, 617,
                933, 481, 652, 796, 594, 151, 82, 183, 241, 525, 221, 951, 732, 799, 483, 368,
                354, 776, 175, 974, 187, 913, 842};
        minimumRefill(arr, 1439, 1209);
    }

    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int res = 0;
        int l = 0, r = plants.length - 1;
        int a = capacityA, b = capacityB;
        while (l <= r) {
            if (a >= plants[l]) {
                a -= plants[l];
                l++;
            } else if (b >= plants[r]) {
                b -= plants[r];
                r--;
            } else {
                res++;
                if (capacityA >= capacityB) {
                    a = capacityA;
                } else {
                    b = capacityB;
                }
            }
        }

        return res;
    }
}
