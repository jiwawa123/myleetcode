package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/26
    time 7:17 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeafSimilar {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(5);
        t1.right = new TreeNode(1);
        t1.left.left = new TreeNode(6);
        t1.left.right = new TreeNode(2);
        t1.right.left = new TreeNode(9);
        t1.right.right = new TreeNode(8);
        t1.left.right.right = new TreeNode(4);
        t1.left.right.left = new TreeNode(7);
        System.out.println(leafSimilar(t1,t1));
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> statck = new Stack<>();
        while (root1 != null || !statck.isEmpty()) {
            if (root1 != null) {
                statck.push(root1);
                if (root1.left == null && root1.right == null) {
                    list.add(root1.val);
                }
                    root1 = root1.left;

            } else {
                root1 = statck.pop();
                root1 = root1.right;
            }
        }

        List<Integer> list1 = new ArrayList<>();
        Stack<TreeNode> statck1 = new Stack<>();
        while (root2 != null || !statck1.isEmpty()) {
            if (root2 != null) {
                statck1.push(root2);
                if (root2.left == null && root2.right == null) {
                    list1.add(root2.val);
                }
                    root2 = root2.left;

            } else {
                root2 = statck1.pop();
                root2 = root2.right;
            }
        }
        if (list.size() != list1.size())
            return false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != list1.get(i))
                return false;
        }
        return true;
    }

}
