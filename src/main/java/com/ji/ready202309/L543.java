package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/17:59
 */
public class L543 {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        getLen(root);
        return max;

    }

    public int getLen(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = getLen(root.left);

        int r = getLen(root.right);
        int now = l + r + 1;
        max = Math.max(now, max);
        return Math.max(l, r) + 1;
    }
}
