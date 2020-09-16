package com.ji.algo.pdd0901;

import java.util.*;

/**
 * user ji
 * data 2020/9/1
 * time 6:59 下午
 */
public class G4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        Arrays.sort(arr);
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > i)
                    break;
                if (i % arr[j] == 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

}
