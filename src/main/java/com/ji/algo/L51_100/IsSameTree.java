package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/11
    time 9:20 AM
*/

import com.ji.algo.Util.TreeNode;

public class IsSameTree {
    public static void main(String[] args) {

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        if(p==null||q==null)
            return false;
        if(p.value!=q.value)
            return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
