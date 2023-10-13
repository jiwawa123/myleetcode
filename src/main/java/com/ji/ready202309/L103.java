package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/08:36
 */
public class L103 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        List<TreeNode> now = new LinkedList<>();
        now.add(root);
        int index = 0;
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
            if (index % 2 == 0) {
                for (int i = 0; i < now.size(); i++) {
                    list.add(now.get(i).val);
                }
            } else {
                for (int i = now.size() - 1; i >= 0; i--) {
                    list.add(now.get(i).val);
                }
            }
            res.add(list);
            index++;
            now = next;

        }

        return res;
    }
}
