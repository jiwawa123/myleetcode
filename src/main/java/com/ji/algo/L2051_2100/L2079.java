package com.ji.algo.L2051_2100;

/**
 * @author ji
 * @data 2021/12/10
 * @time 8:36 下午
 */
public class L2079 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 4, 2, 3};
        System.out.println(wateringPlants(arr, 4));
    }

    public static int wateringPlants(int[] plants, int capacity) {
        int res = 0;
        int last = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (last >= plants[i]) {
                res++;
                last -= plants[i];
            } else {
                res += (i + 1) * 2 - 1;
                last = capacity - plants[i];
            }
        }
        return res;
    }
}
