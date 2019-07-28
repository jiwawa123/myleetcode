package com.ji.algo.L801_850;/*
    user ji
    data 2019/7/28
    time 10:33 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistanceK {
    List<Integer> list = new ArrayList<>();
    Map<TreeNode, TreeNode> pre = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        help(root, null);
        help(root, K, new HashMap<Integer, Integer>());
        return list;
    }

    public void help(TreeNode root, TreeNode par) {
        if (root == null)
            return;
        pre.put(root, par);
        help(root.left, root);
        help(root.right, root);
    }

    public void help(TreeNode root, int k, Map<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        if (map.containsKey(root.value))
            return;
        if (k == 0) {
            list.add(root.value);
            return;
        }
        map.put(root.value, 1);
        help(root.left, k - 1, new HashMap<>(map));
        help(root.right, k - 1, new HashMap<>(map));
        help(pre.get(root), k - 1, new HashMap<>(map));
    }
}
