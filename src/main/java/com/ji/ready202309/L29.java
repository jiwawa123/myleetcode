package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/07/21:04
 */
public class L29 {

    int sum = 0;

    public int sumNumbers(TreeNode root) {

        dfs(root, 0);

        return sum;
    }

    public void dfs(TreeNode root, int now) {
        if (root == null) {
            return;
        }
        int tmp = now * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += tmp;
            return;
        }
        dfs(root.left, tmp);
        dfs(root.right, tmp);
    }
}
