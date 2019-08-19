package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/8/19
    time 1:26 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {
    public static void main(String[] args) {

    }

    public int maxLevelSum(TreeNode root) {
        int level = 0;
        int next = 1;
        int sum = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            int count = 0;
            Queue<TreeNode> que = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode tmp = queue.remove();
                count += tmp.value;
                if (tmp.left != null) {
                    que.add(tmp.left);
                }
                if (tmp.right != null) {
                    que.add(tmp.right);
                }
            }
            queue = que;
            if (sum < count) {
                level = next;
                sum = count;
            }
            next++;
        }
        return level;
    }
}
