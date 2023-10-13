package com.ji.ready202309;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/20/08:18
 */
public class L274 {

    public int hIndex(int[] citations) {
        int res = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= (citations.length - i)) {
                return (citations.length - i);
            }
        }

        return res;
    }
}
