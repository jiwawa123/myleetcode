package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/18:39
 */
public class L113 {

    public static void main(String[] args) {

    }

    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        help(root, targetSum, new LinkedList<>());
        return res;
    }

    public void help(TreeNode node, int target, List<Integer> li) {
        if (node == null) {
            return;
        }
        li.add(node.val);
        if (node.val == target && node.left == null && node.right == null) {
            res.add(li);
            return;
        }
        help(node.left, target - node.val, li);
        help(node.right, target - node.val, li);

    }
}
