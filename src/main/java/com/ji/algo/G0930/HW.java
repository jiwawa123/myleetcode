package com.ji.algo.G0930;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * user ji
 * data 2020/9/30
 * time 6:50 下午
 */
public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.add(sc.nextInt());
            }
        }
        Collections.sort(list);
        int arr[][] = new int[n][m];
        int start = 0;
        int l = 0;
        int r = n - 1;
        int u = 0;
        int d = m - 1;
        
        while (l <= r && u <= d) {
            for (int i = l; i <= r; i++) {
                arr[u][i] = list.get(start++);
            }
            u++;
            for (int i = u; i <= d; i++) {
                arr[i][r] = list.get(start++);
            }
            r--;
            for (int i = r; i >= l && u <= d; i--) {
                arr[d][i] = list.get(start++);
            }
            d--;
            for (int i = d; i >= u && l <= r; i--) {
                arr[i][l] = list.get(start++);
            }
            l++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
                if (j != m - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
