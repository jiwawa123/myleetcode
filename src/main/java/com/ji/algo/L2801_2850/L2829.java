package com.ji.algo.L2801_2850;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/08/24/20:47
 */
public class L2829 {
    public static void main(String[] args) {
        System.out.println(minimumSum(5, 4));
    }

    public static int minimumSum(int n, int k) {
        int index = 1;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        while (n > 0) {
            if (!set.contains(k - index)) {
                set.add(index);
                count += index;
                n--;
            }

            index++;
        }
        return count;
    }
}
