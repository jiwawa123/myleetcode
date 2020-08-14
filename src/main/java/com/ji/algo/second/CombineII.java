package com.ji.algo.second;

import com.ji.algo.Util.ListNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/8/14
 * time 8:52 上午
 */
public class CombineII {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1};
        List<List<Integer>> res = new CombineII().permuteUnique(arr);
        System.out.println(res.size());
        for (List<Integer> tmp : res
        ) {
            tmp.forEach(System.out::println);
            System.out.println("===============");
        }
    }

    boolean flag[];
    List<List<Integer>> res;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        res = new LinkedList<>();

        flag = new boolean[nums.length];
        dfs(nums.length, nums, new LinkedList<>());
        return res;
    }

    public void dfs(int n, int nums[], List<Integer> list) {
        if (list.size() == n) {
            res.add(new LinkedList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !flag[i - 1]) continue;
            if (flag[i]) continue;
            flag[i] = true;
            list.add(nums[i]);
            dfs(n, nums, new LinkedList(list));
            list.remove(list.size() - 1);
            flag[i] = false;
        }
    }

}
