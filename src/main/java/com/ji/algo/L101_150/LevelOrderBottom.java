package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/11
    time 10:24 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.*;

public class LevelOrderBottom {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
                tmp.add(tt.val);
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
        Collections.reverse(list);
        return list;
    }
}
