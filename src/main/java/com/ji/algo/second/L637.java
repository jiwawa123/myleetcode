package com.ji.algo.second;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * user ji
 * data 2020/9/12
 * time 9:42 上午
 */
public class L637 {
    public static void main(String[] args) {

    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> next = new LinkedList<>();
            double sum = 0.0;
            int count = 0;
            while (!queue.isEmpty()) {
                root = queue.remove();
                sum += root.val;
                count++;
                if (root.left != null) {
                    next.add(root.left);
                }
                if (root.right != null) {
                    next.add(root.right);
                }
            }
            res.add(sum / count);
            queue = next;
        }
        return res;
    }
}
