package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 3:12 PM
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive {
    public static void main(String[] args) {

    }

    // 使用map记录左右两边的数量即可
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int max = 0;
        for (int k : nums
                ) {
            if (!map.containsKey(k)) {
                Integer left = map.get(k - 1);
                Integer right = map.get(k + 1);
                if (left == null && right == null) {
                    max = Math.max(1, max);
                    map.put(k, 1);
                } else if (left != null && right != null) {
                    int tmp = right + left + 1;
                    max = Math.max(tmp, max);
                    map.put(right + k, tmp);
                    map.put(k - left, tmp);
                    map.put(k, 1);
                } else if (left != null) {
                    int tmp = left + 1;
                    max = Math.max(tmp, max);
                    map.put(k - left, tmp);
                    map.put(k, 1);
                } else {
                    int temp = right + 1;
                    max = Math.max(max, temp);
                    map.put(right + k, temp);
                    map.put(k, temp);
                }
            }
        }
        return max;
    }

    public int longestConsecutiveII(int nums[]) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            if (nums[i] == nums[i - 1] + 1)
                count++;
            else
                count = 1;

            max = Math.max(max, count);
        }
        return max;
    }
}
