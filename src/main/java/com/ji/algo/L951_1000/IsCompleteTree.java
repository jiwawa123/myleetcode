package com.ji.algo.L951_1000;/*
    user ji
    data 2019/7/25
    time 11:01 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsCompleteTree {
    public static void main(String[] args) {
        


    }

    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode temp;
        boolean flag = false;
        while (!queue.isEmpty()) {
            temp = queue.remove();
            if (temp == null){
                flag = true;
                continue;
            }
            if (flag) return false;
            queue.add(temp.left);
            queue.add(temp.right);
        }
        return true;
    }
}
