package com.ji.algo.L2601_2650;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/03/23:22
 */
public class L2610 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        int len = 0;
        List<List<Integer>> res = new LinkedList<>();
        boolean[] flag = new boolean[nums.length];
        while (len < nums.length) {
            Set<Integer> set = new HashSet<>();
            List<Integer> l = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                if(flag[i]){
                    continue;
                }
                if (!set.contains(nums[i])) {
                    l.add(nums[i]);
                    flag[i] = true;
                    len++;
                    set.add(nums[i]);
                }
            }
            res.add(l);
        }
        return res;
    }
}
