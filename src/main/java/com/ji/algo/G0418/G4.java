package com.ji.algo.G0418;

import java.util.*;

public class G4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int arr[] = new int[len];
            Map<Integer, LinkedList<Integer>> map = new HashMap<>();
            for (int j = 0; j < len; j++) {
                int t = sc.nextInt();
                arr[j] = t;
                map.put(t, new LinkedList<>());
            }
            for (int j = 0; j < len; j++) {
                map.get(arr[j]).add(sc.nextInt());
            }
            deal(map);
        }
    }

    public static void deal(Map<Integer, LinkedList<Integer>> map) {
        int count = 0;
        for (Map.Entry<Integer, LinkedList<Integer>> entry : map.entrySet()) {
            int max = 0;
            for (int t : entry.getValue()) {
                count += t;
                max = Math.max(max, t);
            }
            count -= max;
        }
        System.out.println(count);
    }
}
