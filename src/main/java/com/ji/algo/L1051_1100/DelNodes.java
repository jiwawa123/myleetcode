package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/7/8
    time 11:09 AM
*/

import com.ji.algo.Util.ListNode;
import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DelNodes {
    public static void main(String[] args) {

    }

    List<TreeNode> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if (root == null)
            return list;
        for (int t : to_delete
                ) {
            map.put(t, 1);
        }
        help(root);
        return list;
    }

    public void help(TreeNode root) {
        if (root == null)
            return;
        if (map.containsKey(root.value)) {
            help(root.left);
            help(root.right);
        } else {
            root.left = delete(root.left);
            root.right = delete(root.right);
            list.add(root);
        }
    }

    public TreeNode delete(TreeNode root) {
        if (root == null)
            return root;
        if (map.containsKey(root.value)) {
            help(root.left);
            help(root.right);
            return null;
        } else {
            root.left = delete(root.left);
            root.right = delete(root.right);
            return root;
        }
    }
}
