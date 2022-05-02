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
            int tmp = arr[i] - '0';
            if (tmp % 2 == 0) {
                odd.add(tmp);
            } else {
                even.add(tmp);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        int i = odd.size() - 1, j = even.size() - 1;
        StringBuilder sp = new StringBuilder();
        for (int k = 0; k < arr.length; k++) {
            int tmp = arr[i] - '0';
            if (tmp % 2 == 0) {
                sp.append(odd.get(i--));
            }else{
                sp.append(even.get(i--));
            }
        }
        return Integer.valueOf(sp.toString());
    }
}
