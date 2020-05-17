package com.ji.algo.L401_450;/*
    user ji
    data 2019/7/14
    time 10:15 PM
*/

import com.ji.algo.Util.TreeNode;

public class DeleteNode {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(5);
        t.left = new TreeNode(3);
        t.right = new TreeNode(6);
        t.left.left = new TreeNode(2);
        t.left.right = new TreeNode(4);
        t.right.right = new TreeNode(7);
        deleteNode(t, 3);
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return root;
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null)
                return root.left;
            TreeNode rightSmallest = root.right;
            while (rightSmallest.left != null) {
                rightSmallest = rightSmallest.left;
            }
            rightSmallest.left = root.left;
            return root.right;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        } else {
            root.right = deleteNode(root.right, key);
            return root;
        }

    }
}
