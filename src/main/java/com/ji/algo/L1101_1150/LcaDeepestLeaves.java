package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/7/17
    time 9:51 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LcaDeepestLeaves {
    public static void main(String[] args) {

    }

    int depth = 0;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (root == null)
            return root;
        Map<Integer, Set<TreeNode>> dep = new HashMap<>();
        Map<TreeNode, TreeNode> pre = new HashMap<>();
        Set<TreeNode> set = new HashSet<>();
        set.add(root);
        dep.put(1, set);
        help(dep, pre, root, root.left, 1);
        help(dep, pre, root, root.right, 1);
        return help(dep, pre);
    }

    public void help(Map<Integer, Set<TreeNode>> dep, Map<TreeNode, TreeNode> pre,
                     TreeNode last, TreeNode now, int d) {
        if (now == null)
            return;
        pre.put(now, last);
        d += 1;
        depth = Math.max(depth, d);
        Set<TreeNode> tmp = dep.getOrDefault(d, new HashSet<>());
        tmp.add(now);
        dep.put(d, tmp);
        help(dep, pre, now, now.left, d);
        help(dep, pre, now, now.right, d);
    }

    public TreeNode help(Map<Integer, Set<TreeNode>> dep, Map<TreeNode, TreeNode> pre) {
        Set<TreeNode> tmp = dep.get(depth--);
        if (tmp.size() == 1) {
            return tmp.iterator().next();
        } else {
            Map<Integer, Set<TreeNode>> next = new HashMap<>();
            Set<TreeNode> rela = new HashSet<>();
            for (TreeNode node : tmp
                    ) {
                rela.add(pre.get(node));
            }
            next.put(depth, rela);
            return help(next, pre);
        }
    }
}
