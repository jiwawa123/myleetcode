package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/17:05
 */
public class L144 {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                res.add(root.val);
                if (root.right != null) {
                    stack.add(root.right);
                }
                root = root.left;
            } else {
                root = stack.pop();
            }

        }
        return res;
    }
}
