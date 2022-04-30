package com.ji.algo.L2201_2250;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2022/04/30/下午10:59
 */
public class L2231 {
    public static void main(String[] args) {
        System.out.println(largestInteger(1234));
    }

    public static int largestInteger(int num) {
        if (num < 10) {
            return num;
        }
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        char[] arr = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                odd.add(arr[i] - '0');
            } else {
                even.add(arr[i] - '0');
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        int i = odd.size() - 1, j = even.size() - 1;
        StringBuilder sp = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                sp.append(odd.get(i--));
            }
            if (j >= 0) {
                sp.append(even.get(j--));
            }
        }
        return Integer.valueOf(sp.toString());
    }
}
