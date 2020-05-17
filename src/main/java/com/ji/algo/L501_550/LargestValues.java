package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/9
    time 5:05 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValues {
    public static void main(String[] args) {

    }

    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            Queue<TreeNode> que = new LinkedList<>();
            int val = Integer.MIN_VALUE;
            while (!queue.isEmpty()) {
                TreeNode tmp = queue.remove();
                val = Math.max(val,tmp.val);
                if (tmp.left != null)
                    que.add(tmp.left);
                if (tmp.right != null)
                    que.add(tmp.right);
            }
            queue = que;
            list.add(val);
        }
        return list;
    }
}
