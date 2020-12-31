package com.ji.algo.G1227;

/**
 * user ji
 * data 2020/12/27
 * time 6:37 下午
 */
public class G2 {
    public static void main(String[] args) {
        int arr[][] = {{5, 2}, {5, 4}, {10, 3}, {20, 1}};
        System.out.println(averageWaitingTime(arr));
    }

    public static double averageWaitingTime(int[][] customers) {
        double count = 0.0;
        int n = customers.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int start = customers[i][0];
            int cost = customers[i][1];
            if (start >= index) {
                count += cost;
                index = start + cost;
            } else {
                index += cost;
                count += index - start;
            }
        }
        return count / n;
    }
}
