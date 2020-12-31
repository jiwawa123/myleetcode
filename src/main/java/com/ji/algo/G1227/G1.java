package com.ji.algo.G1227;

/**
 * user ji
 * data 2020/12/27
 * time 6:24 下午
 */
public class G1 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 0, 1};
        int arr2[] = {1, 0, 0, 0, 1, 1};
        System.out.println(countStudents(arr, arr2));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        boolean flag[] = new boolean[n];
        int size = 0;
        int i = 0, j = 0;
        while (j < n) {
            if (sandwiches[j] == students[i % n] && flag[i % n] == false) {
                flag[i % n] = true;
                i++;
                j++;
                size++;
            } else {
                i++;
            }
            if (i > n * n) {
                return n - size;
            }
        }
        return n - size;
    }
}
