package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/11
    time 8:43 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.*;

public class ZigzagLevelOrder {
    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        boolean flag = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            Queue<TreeNode> que = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode tp = queue.remove();
                if (tp.left != null) {
                    que.add(tp.left);
                }
                if (tp.right != null) {
                    que.add(tp.right);
                }
                tmp.add(tp.val);
                if (!flag)
                    Collections.reverse(tmp);
                list.add(tmp);
                queue = que;
                flag = !flag;
            }

        }
        return list;
    }
}
