package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/08:45
 */
public class L102 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        List<TreeNode> now = new LinkedList<>();
        now.add(root);
        while (!now.isEmpty()) {
            List<TreeNode> next = new LinkedList<>();
            for (int i = 0; i < now.size(); i++) {
                TreeNode node = now.get(i);
                if (node.left != null) {
                    next.add(node.left);
                }
                if (node.right != null) {
                    next.add(node.right);
                }
            }
            List<Integer> list = new LinkedList<>();

            for (int i = 0; i < now.size(); i++) {
                list.add(now.get(i).val);
            }
            res.add(list);
            now = next;

        }

        return res;
    }
}
