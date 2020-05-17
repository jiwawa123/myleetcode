package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 7:12 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.*;

public class PreOrderTraversal {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(2);
        t1.left = new TreeNode(1);
        t1.right = new TreeNode(3);
        t1.left.right = new TreeNode(4);
        preorderTraversal(t1);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root == null) {
                root = stack.pop();
            }
            list.add(root.val);
            if (root.right != null) {
                stack.add(root.right);
            }
            root = root.left;
        }
        return list;
    }

}
