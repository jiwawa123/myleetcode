package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/7/12
    time 9:26 AM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestArithSeqLength {
    public static void main(String[] args) {
        int arr[] = {44, 46, 22, 68, 45, 66, 43, 9, 37, 30, 50, 67, 32, 47, 44, 11, 15,
                4, 11, 6, 20, 64, 54, 54, 61, 63, 23, 43, 3, 12, 51, 61, 16, 57, 14, 12, 55,
                17, 18, 25, 19, 28, 45, 56, 29, 39, 52, 8, 1, 21, 17, 21, 23, 70, 51, 61, 21, 52, 25, 28};
        System.out.println(longestArithSeqLength(arr));
    }

    public static int longestArithSeqLength(int[] A) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            List<Integer> tmp = map.getOrDefault(A[i], new ArrayList<>());
            tmp.add(i);
            map.put(A[i], tmp);
        }
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A.length - i < max)
                break;
            for (int j = i + 1; j < A.length; j++) {
                int tmp = 2;
                int d = A[i] - A[j];
                int next = A[j] - d;
                int index = j;
                while (map.containsKey(next)) {
                    List<Integer> l = map.get(next);
                    boolean flag = false;
                    for (int k = 0; k < l.size(); k++) {
                        if (l.get(k) > index) {
                            index = l.get(k);
                            flag = true;
                            break;
                        }
                    }
                    if (!flag)
                        break;
                    next = next - d;
                    tmp++;
                }
                if (tmp > 2)
                    max = Math.max(tmp, max);
            }
        }
        return max;
    }
}
