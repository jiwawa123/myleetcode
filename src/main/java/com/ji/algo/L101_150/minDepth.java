package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/12
    time 10:09 AM
*/

import com.ji.algo.Util.TreeNode;

public class minDepth {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int count = 1;
        if(root.left==null&&root.right==null)
            return count;
        boolean flag = true;
        if(root.left!=null){
            count = 1+minDepth(root.left);
            flag = false;
        }
        if(root.right!=null){
            int tmp = 1+minDepth(root.right);
            if(!flag){
                count = Math.min(count,tmp);
            }else{
                count = tmp;
            }

        }
        return count;

    }
}
