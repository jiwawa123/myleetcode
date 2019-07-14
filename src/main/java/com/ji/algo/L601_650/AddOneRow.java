package com.ji.algo.L601_650;/*
    user ji
    data 2019/7/14
    time 4:58 PM
*/

import com.ji.algo.Util.TreeNode;

public class AddOneRow {
    public static void main(String[] args) {

    }

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode head = new TreeNode(v);
            head.left = root;
            return head;
        }
        root.left = help(root.left, d - 1, v, 1);
        root.right = help(root.right, d - 1, v, 2);
        return root;
    }

    public TreeNode help(TreeNode root, int d, int v, int flag) {
        if (d > 1) {
            if (root == null)
                return root;
            root.left = help(root.left, d - 1, v, 1);
            root.right = help(root.right, d - 1, v, 2);
            return root;
        } else {
            TreeNode tmp = new TreeNode(v);
            if (flag == 1) {
                tmp.left = root;
            } else {
                tmp.right = root;
            }
            return tmp;
        }
    }
}
