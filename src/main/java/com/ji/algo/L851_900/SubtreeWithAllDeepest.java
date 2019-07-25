package com.ji.algo.L851_900;/*
    user ji
    data 2019/7/25
    time 10:49 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubtreeWithAllDeepest {

    Map<TreeNode, TreeNode> pre = new HashMap<>();
    Map<Integer, Set<TreeNode>> dep = new HashMap<>();
    int count = 0;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return root;
        Set<TreeNode> f = new HashSet<>();
        f.add(root);
        dep.put(0, f);
        help(1, root.left, root);
        help(1, root.right, root);
        Set<TreeNode> l = dep.get(count);
        return help(l);
    }

    public void help(int depth, TreeNode root, TreeNode par) {
        if (root == null)
            return;
        count = Math.max(count, depth);
        Set<TreeNode> set = dep.getOrDefault(depth, new HashSet<>());
        set.add(root);
        pre.put(root, par);
        dep.put(depth, set);
        help(depth + 1, root.left, root);
        help(depth + 1, root.right, root);

    }

    public TreeNode help(Set<TreeNode> set) {
        if (set.size() == 1) {
            for (TreeNode tmp : set) {
                return tmp;
            }
        }
        Set<TreeNode> tmp = new HashSet<>();
        for (TreeNode tt : set
                ) {
            tmp.add(pre.get(tt));
        }
        return help(tmp);
    }
}
