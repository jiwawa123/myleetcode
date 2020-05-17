package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 11:45 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.*;

public class MaxSumPath {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        maxPathSum(t1);
    }

    public static int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        int tmp = list.get(0);
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > (list.get(i) + tmp)) {
                tmp = list.get(i);
            }
            max = Math.max(max, max + list.get(i));
        }
        return max;
    }
}
