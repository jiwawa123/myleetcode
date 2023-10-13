package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/10/09:26
 */
public class LO54 {
    public static void main(String[] args) {

    }

    public int kthLargest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        return res.get(res.size() - k);
    }
}
