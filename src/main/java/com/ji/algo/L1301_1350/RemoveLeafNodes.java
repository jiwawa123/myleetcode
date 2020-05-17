package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/1/30
    time 10:09 AM
*/

import com.ji.algo.Util.TreeNode;

public class RemoveLeafNodes {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(2);
        treeNode.right.left = new TreeNode(2);
        treeNode.right.right = new TreeNode(4);
        System.out.println(removeLeafNodes(treeNode,2).val);
    }

    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null)
            return root;
        if (root.left == null && root.right == null) {
            if (root.val == target)
                return null;
            return root;
        } else {
            root.left = removeLeafNodes(root.left, target);
            root.right = removeLeafNodes(root.right, target);
            if(root.val !=target||root.left!=null||root.right!=null)
                return root;
            return removeLeafNodes(root,target);
        }
    }
}
