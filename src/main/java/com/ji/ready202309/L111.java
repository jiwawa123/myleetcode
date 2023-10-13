package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/11/22:16
 */
public class L111 {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }

        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (root.right == null) {
            return 1 + l;
        }
        if (root.left == null) {
            return 1 + r;
        }

        return 1 + Math.min(l, r);
    }
}
