package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/14
    time 11:50 AM
*/

import com.ji.algo.Util.TreeNode;

public class HasPathSum {
    public static void main(String[] args) {

    }
    //直接在当前节点的位置直接终结即可
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.val == sum && (root.left == null && root.right == null))
            return true;
        return hasPathSum(root.left, sum - root.val)
                || hasPathSum(root.right, sum - root.val);
    }
}
