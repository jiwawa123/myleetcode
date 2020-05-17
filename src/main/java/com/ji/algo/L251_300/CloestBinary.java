package com.ji.algo.L251_300;/*
    user ji
    data 2019/8/30
    time 12:53 PM
*/

import com.ji.algo.Util.TreeNode;

public class CloestBinary {
    public static void main(String[] args) {

    }

    public int searchTree(TreeNode root, int target) {
        if (root.left == null && root.right == null)
            return root.val;
        if (root.val < target && root.right == null)
            return root.val;
        if (root.val > target && root.left == null)
            return root.val;
        if (root.val == target)
            return target;
        if (root.val > target) {
            return help(root.left, target, root.val);
        } else {
            return help(root.right, target, root.val);
        }
    }

    public int help(TreeNode root, int target, int last) {
        if (root.val < target && root.right == null)
            return root.val;
        if (root.val > target && root.left == null)
            return root.val;
        if (target < last && root.val > target) {
            return Math.abs(last - target) > Math.abs(target - root.val) ? root.val : last;
        }
        if (target < last && root.val < target) {
            return Math.abs(last - target) > Math.abs(target - root.val) ? root.val : last;
        }
        if (root.val == target)
            return target;
        if (root.val > target) {
            return help(root.left, target, root.val);
        } else {
            return help(root.right, target, root.val);
        }

    }
}
