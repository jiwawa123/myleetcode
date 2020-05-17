package com.ji.algo.L951_1000;/*
    user ji
    data 2019/6/16
    time 5:00 PM
*/

import com.ji.algo.Util.TreeNode;

public class Flip {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null)
            return true;
        if((root1==null||root2==null)||root1.val !=root2.val)
            return false;
        return (flipEquiv(root1.left,root2.right)&&flipEquiv(root1.right,root2.left))||
                (flipEquiv(root1.left,root2.left)&&flipEquiv(root1.right,root2.right));
    }
}
