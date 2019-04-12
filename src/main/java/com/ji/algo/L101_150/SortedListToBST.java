package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/12
    time 7:58 AM
*/

import com.ji.algo.Util.ListNode;
import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SortedListToBST {
    public static void main(String[] args) {

    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        List<Integer> list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int nums[] = list.stream().mapToInt(Integer::valueOf).toArray();
        return getSort(nums, 0, nums.length - 1);
    }

    public TreeNode getSort(int nums[], int start, int end) {
        if (start > end)
            return null;
        int med = (start + end) / 2;
        TreeNode root = new TreeNode(nums[med]);
        root.left = getSort(nums, start, med - 1);
        root.right = getSort(nums, med + 1, end);
        return root;
    }
}
