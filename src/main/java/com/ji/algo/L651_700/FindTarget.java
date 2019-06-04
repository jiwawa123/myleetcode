package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/4
    time 9:40 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindTarget {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
         t1.left = new TreeNode(3);
        System.out.println(findTarget(t1,8));
    }

    public static boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.value);
                root = root.right;
            }
        }
        int i = 0, j = list.size() - 1;
        while (i < j) {
            if (list.get(i) + list.get(j) == k) {
                return true;
            }
            if (list.get(i) + list.get(j) < k) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
