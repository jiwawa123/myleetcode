package com.ji.algo.L101_105;/*
    user ji
    data 2019/4/11
    time 8:14 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        levelOrder(t1);
    }
    //二叉树的层次遍历
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            Queue<TreeNode> que = new LinkedList<>();
            while(!queue.isEmpty()){
                TreeNode tt = queue.remove();
                tmp.add(tt.value);
                if(tt.left!=null){
                    que.add(tt.left);
                }
                if(tt.right!=null){
                    que.add(tt.right);
                }
            }
            queue = que;
            list.add(tmp);
        }
        return list;
    }
}
