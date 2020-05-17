package com.ji.algo.L551_600;/*
    user ji
    data 2019/7/14
    time 6:56 PM
*/

import com.ji.algo.Util.TreeNode;

public class SubTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(4);
        t1.left = new TreeNode(5);
        t1.left.left = new TreeNode(1);
        t1.left.right = new TreeNode(2);
        System.out.println(new SubTree().isSubtree(t1,t1.left));

    }

    boolean flag = false;

    public boolean isSubtree(TreeNode s, TreeNode t) {
        help(s, t);
        return flag;
    }

    public void help(TreeNode s, TreeNode t) {
        if (flag)
            return;
        if(helpI(s,t)){
            flag = true;
            return;
        }
        if(s==null)
            return;
        help(s.left,t);
        help(s.right,t);

    }

    public boolean helpI(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null || t1.val != t2.val)
            return false;
        return helpI(t1.left, t2.left) && helpI(t1.right, t2.right);
    }
}

