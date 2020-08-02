package com.ji.algo.G0802;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/8/2
 * time 10:16 上午
 */
public class G2 {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 2, 3, 7, 6, 4, 5};
        System.out.println(getWinner(arr, 7));
    }

    public static int getWinner(int[] arr, int k) {
        int tmp[] = new int[arr.length];
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
            list.add(arr[i]);
        }
        Arrays.sort(tmp);

        if (k >= arr.length) {
            return tmp[tmp.length - 1];
        }
        int len = 0;
        while (len < k) {
            int f = list.get(0);
            int s = list.get(1);
            int max = Math.max(f, s);
            if (f == max) {
                list.remove(1);
                len++;
                list.add(s);
            } else {
                len = 1;
                list.remove(0);
                list.add(f);
            }
        }

        return list.get(0);

    }
}
