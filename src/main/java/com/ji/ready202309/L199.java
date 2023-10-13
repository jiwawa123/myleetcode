package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/13:49
 */
public class L199 {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {

        LinkedList<TreeNode> list = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        list.add(root);
        while (!list.isEmpty()) {
            LinkedList<TreeNode> next = new LinkedList<>();
            for (int i = 0; i < list.size(); i++) {
                root = list.get(i);
                if (root.left != null) {
                    next.add(root.left);
                }
                if (root.right != null) {

                    next.add(root.right);
                }
            }
            res.add(list.getLast().val);
            list = next;
        }
        return res;

    }
}
