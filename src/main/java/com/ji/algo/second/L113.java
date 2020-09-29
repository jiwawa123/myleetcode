package com.ji.algo.second;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/9/26
 * time 8:40 上午
 */
public class L113 {
    public static void main(String[] args) {

    }

    List<List<Integer>> list;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        list = new LinkedList<>();

        helper(new LinkedList<>(), sum, root);
        return list;
    }

    public void helper(List<Integer> tmp, int sum, TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            sum = root.val;
            tmp.add(root.val);
            list.add(tmp);
            return;
        }

        sum -= root.val;
        tmp.add(root.val);
        helper(new LinkedList<>(tmp), sum, root.left);
        helper(new LinkedList<>(tmp), sum, root.right);
    }
}
