package com.ji.algo.second;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * user ji
 * data 2020/9/19
 * time 9:21 上午
 */
public class L404SumOfLeave {
    int res = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, 0);

    }

    public int dfs(TreeNode root, int d) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null && d == -1) {
            return root.val;
        }
        return dfs(root.left, -1) + dfs(root.right, 1);
    }
}
