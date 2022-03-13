package com.ji.algo.L2151_2200;

import com.ji.algo.Util.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2022/03/13/下午7:24
 */
public class L2196 {
    public static void main(String[] args) {

    }

    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<TreeNode> set = new HashSet<>();
        Map<Integer, TreeNode> map = new HashMap<>();
        for (int i = 0; i < descriptions.length; i++) {
            int f = descriptions[i][0];
            int c = descriptions[i][1];
            TreeNode father = map.getOrDefault(f, new TreeNode(f));
            TreeNode child = map.getOrDefault(c, new TreeNode(c));
            set.add(child);
            if (descriptions[i][2] == 1) {
                father.left = child;
            } else {
                father.right = child;
            }
            map.put(f, father);
            map.put(c, child);
        }
        for (TreeNode node : map.values()
        ) {
            if (!set.contains(node)){
                return node;
            }

        }
        return null;
    }
}
