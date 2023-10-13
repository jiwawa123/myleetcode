package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/21:01
 */
public class L110 {


    boolean f = true;

    public boolean isBalanced(TreeNode root) {
        int l = getLen(root.left);
        int r = getLen(root.right);
        return f && Math.abs(l - r) < 2;
    }

    public int getLen(TreeNode root) {
        if (!f) {
            return 0;
        }
        if (root == null) {
            return 0;
        }
        int l = getLen(root.left);
        int r = getLen(root.right);
        if (Math.abs(l - r) > 1) {
            f = false;
        }
        return 1 + Math.max(l, r);
    }

}
