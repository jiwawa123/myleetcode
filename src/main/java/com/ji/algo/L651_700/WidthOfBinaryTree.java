package com.ji.algo.L651_700;/*
    user ji
    data 2019/8/4
    time 2:45 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class WidthOfBinaryTree {
    public static void main(String[] args) {
        WidthOfBinaryTree wd = new WidthOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.left.left = new TreeNode(1);
        root.left.left.left.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.right.right.right = new TreeNode(1);
        root.right.right.right.right = new TreeNode(1);
        System.out.println(wd.widthOfBinaryTree(root));

    }

    private int maxW = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 1, 1);
        return maxW;
    }
    private void dfs(TreeNode r, int level, int index) {
        if (r == null) return;
        if (!map.containsKey(level))
            map.put(level,index);
        maxW = Math.max(maxW, index-map.get(level)+1);
        dfs(r.left,level+1,index*2);
        dfs(r.right,level+1,index*2+1);
    }
}
