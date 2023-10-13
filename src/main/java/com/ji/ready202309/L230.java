package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/04/18:00
 */
public class L230 {
    public static void main(String[] args) {

    }

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        int index = 0;
        int res = 0;
        while (root != null || !stack.isEmpty()) {
            if (root == null) {
                index++;
                root = stack.pop();
                if (index == k) {
                    return root.val;
                }
                root = root.right;
            } else {
                stack.add(root);
                root = root.left;
            }
        }

        return res;

    }
}
