package com.ji.algo.L851_900;/*
    user ji
    data 2019/6/4
    time 6:56 PM
*/

import java.util.HashMap;
import java.util.Map;

public class LenLongestFibSubseq {
    public static void main(String[] args) {
        int arr[] = {1,3,5};
        System.out.println(lenLongestFibSubseq(arr));
    }

    public static int lenLongestFibSubseq(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], i);
        }
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int f = A[i];
                int count = 0;
                int index = j;
                int s = A[j];
                while (index < A.length) {
                    if (map.containsKey(f + s)) {
                        index = map.get(f + s);
                        int tmp = s;
                        s = s + f;
                        f = tmp;
                        if(count==0)
                            count = 3;
                        else count++;
                    } else {
                        break;
                    }
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
