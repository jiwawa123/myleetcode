package com.ji.algo.LCP;

import com.ji.algo.Util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/24/23:11
 */
public class Offer054 {
    public static void main(String[] args) {

    }

    boolean f = false;
    Map<Integer, Integer> map = new HashMap<>();
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return root;
        }

        if (!f) {
            f = true;
            trace(root);
        }
        root.val = sum - map.get(root.val) + root.val;
        root.left = convertBST(root.left);
        root.right = convertBST(root.right);
        return root;
    }

    public void trace(TreeNode root) {
        if (root == null) {
            return;
        }
        trace(root.left);
        sum += root.val;
        map.put(root.val, sum);
        trace(root.right);
    }
}
