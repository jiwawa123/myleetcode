package com.ji.algo.G1004;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * user ji
 * data 2020/10/5
 * time 9:18 上午
 */
public class G2 {
    public static void main(String[] args) {

    }

    public boolean isEvenOddTree(TreeNode root) {
        if (root == null)
            return false;
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> next = new LinkedList<>();
            int last = Integer.MIN_VALUE;
            while (!queue.isEmpty()) {
                root = queue.remove();
                if (level % 2 == 0 && root.val <= last)
                    return false;
                if (level % 2 == 1 && root.val >= last)
                    return false;
                if (level % 2 == 0 && root.val % 2 != 1)
                    return false;
                if (level % 2 == 1 && root.val % 2 == 1) {
                    return false;
                }
                if (root.left != null)
                    next.add(root.left);
                if (root.right != null)
                    next.add(root.right);
                last = root.val;
            }
            queue = next;
            level++;
        }
        return true;
    }
}
