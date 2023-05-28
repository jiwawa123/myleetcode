package com.ji.algo.L2023;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/29/18:18
 */
public class L239 {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] tmp = maxSlidingWindow(arr, 3);
        System.out.println(Arrays.toString(tmp));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        int len = nums.length;
        int[] res = new int[len + 1 - k];
        for (int i = 0; i < len; i++) {
            if (!queue.isEmpty() && queue.getFirst() < (i + 1 - k)) {
                queue.removeFirst();
            }
            while (!queue.isEmpty() && nums[queue.getLast()] <= nums[i]) {
                queue.removeLast();
            }
            queue.addLast(i);
            if (i >= k - 1) {

                res[i + 1 - k] = nums[queue.getFirst()];
            }
        }
        return res;
    }
}
