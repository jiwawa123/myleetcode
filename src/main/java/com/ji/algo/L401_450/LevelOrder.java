package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/3
    time 10:18 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> que = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode tmp = queue.remove();
                list.add(tmp.value);
                if (tmp.left != null)
                    que.add(tmp.left);
                if (tmp.right != null)
                    que.add(tmp.right);
            }
            res.add(list);
            queue = que;
        }
        return res;
    }
}
