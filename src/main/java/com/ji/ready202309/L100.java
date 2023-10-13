package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/15:50
 */
public class L100 {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
