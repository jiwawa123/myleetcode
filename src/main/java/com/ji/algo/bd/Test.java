package com.ji.algo.bd;

import com.ji.algo.Util.TreeNode;

/**
 * user ji
 * data 2020/7/17
 * time 7:47 下午
 */
public class Test {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 6, 7};
        TreeNode root = createTreeNode(arr, 0);
        visit(root);
    }


    public static TreeNode createTreeNode(int arr[], int root) {
        if (root >= arr.length)
            return null;
        TreeNode node = new TreeNode(arr[root]);
        node.left = createTreeNode(arr, root * 2 + 1);
        node.right = createTreeNode(arr, root * 2 + 2);
        return node;
    }

    public static void visit(TreeNode root) {
        if (root == null)
            return;
        System.out.println(root.val);
        visit(root.left);
        visit(root.right);
    }
}


