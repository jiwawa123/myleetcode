package com.ji.algo.wyII;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * user ji
 * data 2020/9/12
 * time 2:59 下午
 */
public class G4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String man[] = scanner.nextLine().split(" ");
        String woman[] = scanner.nextLine().split(" ");
        Set<Integer> set[] = new HashSet[man.length * 2];
        for (int i = 0; i < set.length; i++) {
            set[i] = new HashSet<>();
        }
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            set[end].add(start);
        }

    }


}
