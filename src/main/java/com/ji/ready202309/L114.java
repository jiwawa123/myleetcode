package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/15:54
 */
public class L114 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        flatten(node);
    }


    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root == null) {
                root = stack.pop();
                root = root.right;
            } else {
                list.add(root.val);
                stack.add(root);
                root = root.left;
            }
        }
        root = new TreeNode(list.get(0));
        root.left = null;
        TreeNode tmp = root;
        for (int i = 1; i < list.size(); i++) {
            tmp.right = new TreeNode(list.get(i));
            tmp.left = null;
            tmp = tmp.right;
        }

    }
}
