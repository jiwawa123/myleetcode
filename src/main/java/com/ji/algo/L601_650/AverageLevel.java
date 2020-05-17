package com.ji.algo.L601_650;/*
    user ji
    data 2019/5/10
    time 2:05 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevel {
    public static void main(String[] args) {

    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> que = new LinkedList<>();
            int len = 0;
            int sum = 0;
            while (!queue.isEmpty()) {
                TreeNode tmp = queue.remove();
                sum += tmp.val;
                len++;
                if (tmp.left != null)
                    que.add(tmp.left);
                if (tmp.right != null)
                    que.add(tmp.right);
            }
            result.add(sum * 1.0 / len);
            queue = que;
        }
        return result;
    }
}
