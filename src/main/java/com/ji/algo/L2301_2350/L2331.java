package com.ji.algo.L2301_2350;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/24/上午8:23
 */
public class L2331 {
    public static void main(String[] args) {

    }

    public boolean evaluateTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.val == 0) {
            return false;
        } else if (root.val == 1) {
            return true;
        } else if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }


    }
}
