package com.ji.algo.L51_100;/*
    user ji
    data 2019/8/23
    time 7:52 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class RecoverTree {
    public static void main(String[] args) {

    }

    public void recoverTree(TreeNode root) {
        if (root == null)
            return;
        List<TreeNode> list = new ArrayList();
        List<Integer> num = new ArrayList();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                num.add(root.value);
                list.add(root);
                root = root.right;
            }
        }
        Collections.sort(num);
        for (int i = 0; i < num.size(); i++) {
            if(num.get(i)!=list.get(i).value){
                list.get(i).value = num.get(i);
            }
        }
    }
}
