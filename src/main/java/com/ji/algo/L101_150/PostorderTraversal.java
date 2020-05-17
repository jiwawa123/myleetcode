package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 7:59 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.*;

public class PostorderTraversal {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.right = new TreeNode(3);
        t1.right.left = new TreeNode(2);
        postorderTraversal(t1);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Map<TreeNode, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                map.put(root, 1);
                root = root.left;
            } else {
                root = stack.peek();
                if ((root.left == null||map.containsKey(root.left)) && (root.right == null||map.containsKey(root.right))) {
                    stack.pop();
                    list.add(root.val);
                    root = null;
                    continue;
                }

                if (root.right != null) {
                    root = root.right;
                }
            }
        }

        return list;
    }
}
