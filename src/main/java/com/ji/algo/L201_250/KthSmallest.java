package com.ji.algo.L201_250;/*
    user ji
    data 2019/6/19
    time 7:49 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.Stack;

public class KthSmallest {
    public static void main(String[] args) {

    }
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack();
        int index = 0;
        while(!stack.isEmpty()||root!=null){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }else{
                root = stack.pop();
                index++;
                if(index==k)
                    return root.value;
                root = root.right;
            }
        }
        return 0;
    }
}
