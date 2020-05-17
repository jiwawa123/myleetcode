package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/10
    time 2:52 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTravel {
    public List<Integer> list;

    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        if (root == null)
            return list;
        inorder(root);
        return list;
    }

    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public List<Integer> inorderTraversalII(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Stack<TreeNode> statck = new Stack();
        while (root != null || !statck.isEmpty()) {
            if (root != null) {
                statck.push(root);
                root = root.left;
            }else{
                TreeNode tmp = statck.pop();
                list.add(tmp.val);
                root = tmp.right;
            }
        }
        return list;

    }
}
