package com.ji.algo.G0504;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * user ji
 * data 2020/5/4
 * time 9:06 上午
 */
public class LimitLongestSubarray {
    public static void main(String[] args) {
        int arr[] = {10,1,2,4,7,2};
        longestSubarray(arr,5);
    }

    public static int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>(Comparator.naturalOrder());
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < nums.length) {
            minQueue.add(nums[right]);
            maxQueue.add(nums[right++]);
            while (maxQueue.peek() - minQueue.peek() > limit) {
                maxQueue.remove((Integer)nums[left]);
                minQueue.remove((Integer)nums[left++]);
            }
            res = Math.max(right - left, res);
        }
        return res;
    }
}
