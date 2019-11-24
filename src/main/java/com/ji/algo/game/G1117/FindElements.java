package com.ji.algo.game.G1117;/*
    user ji
    data 2019/11/17
    time 10:39 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class FindElements {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-1);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-1);
        FindElements find = new FindElements(root);
        System.out.println(find.find(5));
    }

    public TreeNode myRoot;
    Map<Integer, Integer> map = new HashMap<>();

    public FindElements(TreeNode root) {
        if (root == null)
            return;
        myRoot = new TreeNode(0);
        map.put(0, 1);
        myRoot.left = helpL(0, root.left);
        myRoot.right = helpL(0, root.right);
    }

    public TreeNode helpL(int val, TreeNode left) {
        if (left == null)
            return null;
        map.put(val * 2 + 1, 1);
        TreeNode l = new TreeNode(val * 2 + 1);
        l.left = helpL(val * 2 + 1, left.left);
        l.right = helpL(val * 2 + 1, left.right);
        return l;
    }

    public TreeNode helpR(int val, TreeNode right) {
        if (right == null)
            return null;
        map.put(val * 2 + 2, 1);
        TreeNode r = new TreeNode(val * 2 + 2);
        r.left = helpL(val * 2 + 2, r.left);
        r.right = helpL(val * 2 + 2, r.right);
        return r;
    }

    public boolean find(int target) {

        return map.containsKey(target);
    }



}
