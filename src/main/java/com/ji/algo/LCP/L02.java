package com.ji.algo.LCP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/23/下午8:19
 */
public class L02 {
    public static void main(String[] args) {

    }

    public int halfQuestions(int[] questions) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer t : questions
        ) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        int[] arr = new int[map.size()];
        int index = 0;
        for (Map.Entry entry : map.entrySet()
        ) {
            arr[index++] = (int) entry.getValue();
        }
        Arrays.sort(arr);
        index--;
        int res = 0, count = 0;
        while (count <= questions.length / 2) {
            count += arr[index--];
            res++;
        }
        return res;
    }

}
