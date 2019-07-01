package com.ji.algo.L801_850;/*
    user ji
    data 2019/7/1
    time 10:52 AM
*/

public class LargestTriangleArea {
    public static void main(String[] args) {
        int arr[][] = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(new LargestTriangleArea().largestTriangleArea(arr));
    }

    public double largestTriangleArea(int[][] points) {
        double s = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    s = Math.max(s, computer(points[i], points[j], points[k]));
                }
            }
        }
        return s;
    }

    public double computer(int arr[], int arr1[], int arr2[]) {
        int a = (arr[0] - arr1[0]) * (arr[0] - arr1[0]);
        int b = (arr[1] - arr1[1]) * (arr[1] - arr1[1]);
        double e1 = Math.sqrt(a + b);
        a = (arr[0] - arr2[0]) * (arr[0] - arr2[0]);
        b = (arr[1] - arr2[1]) * (arr[1] - arr2[1]);
        double e2 = Math.sqrt(a + b);
        a = (arr1[0] - arr2[0]) * (arr1[0] - arr2[0]);
        b = (arr1[1] - arr2[1]) * (arr1[1] - arr2[1]);
        double e3 = Math.sqrt(a + b);
        if (e1 >= e2 + e3 || e2 >= e1 + e3 || e3 >= e1 + e2)
            return 0;
        double p = (e1 + e2 + e3) / 2;
        return Math.sqrt(p * (p - e1) * (p - e2) * (p - e3));

    }
}
