package com.ji.algo.second;

import com.ji.algo.L901_950.StockSpanner;
import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * user ji
 * data 2020/9/29
 * time 8:44 上午
 */
public class L145 {
    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stock = new Stack();
        TreeNode r = null;
        while (root != null || !stock.isEmpty()) {
            if (root != null) {
                stock.push(root);
                root = root.left;
            } else {
                root = stock.pop();
                if (root.right == null || root == r) {
                    res.add(root.val);
                    root = root.right;
                    r = root.right;
                } else
                    root = root.right;
            }
        }
        return res;
    }
}
