package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/22:00
 */
public class L94 {
    public static void main(String[] args) {

    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
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
        return res;
    }


}
