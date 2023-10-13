package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/17:15
 */
public class L112 {
    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }

        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);
    }
}
