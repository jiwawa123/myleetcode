package com.ji.algo.second;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * user ji
 * data 2020/9/6
 * time 9:09 上午
 */
public class L107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            Queue<TreeNode> next = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode tmp = queue.remove();
                list.add(tmp.val);
                if (tmp.left != null) {
                    next.add(tmp.left);
                }
                if (tmp.right != null) {
                    next.add(tmp.right);
                }
            }
            res.add(0, list);
            queue = next;
        }
        return res;
    }
}
