package com.ji.algo.G0517;

import com.ji.algo.Util.TreeNode;

/**
 * user ji
 * data 2020/5/17
 * time 6:55 下午
 */
public class G6 {
    public static void main(String[] args) {

    }

    int res;

    public int goodNodes(TreeNode root) {
        help(root, Integer.MIN_VALUE);
        return res;
    }

    public void help(TreeNode root, int last) {
        if (root == null)
            return;
        if (root.val >= last) {
            res++;
        }
        last = Math.max(root.val, last);
        help(root.left, last);
        help(root.right, last);
    }
}
