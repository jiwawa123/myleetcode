package com.ji.ready202309;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/24/15:44
 */
public class G1000049 {
    public static void main(String[] args) {

    }


    public long maximumSumOfHeights(List<Integer> maxHeights) {
        long max = 0;
        for (int i = 0; i < maxHeights.size(); i++) {
            max = Math.max(max, help(maxHeights, i));
        }

        return max;
    }


    public long help(List<Integer> maxHeights, int index) {
        int left = index - 1;
        int tmpLeft = maxHeights.get(index), tmpRight = maxHeights.get(index);
        int right = index + 1;
        long sum = maxHeights.get(index);
        while (left >= 0) {
            tmpLeft = Math.min(maxHeights.get(left), tmpLeft);
            sum += tmpLeft;
            left--;
        }

        while (right < maxHeights.size()) {
            tmpRight = Math.min(maxHeights.get(right), tmpRight);
            sum += tmpRight;
            right++;
        }
        return sum;
    }
}
