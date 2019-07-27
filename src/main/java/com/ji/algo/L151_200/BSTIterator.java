package com.ji.algo.L151_200;/*
    user ji
    data 2019/7/27
    time 9:12 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTIterator {
    List<Integer> list = new ArrayList<>();
    int index = 0;
    int start = 0;
    boolean left = true;
    int count = 0;

    public BSTIterator(TreeNode root) {
        if (root == null)
            return;
        int tmp = root.value;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.value);
                root = root.right;
            }
        }
        index = list.indexOf(tmp);
        start = index == 0 ? 0 : index - 1;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        count++;
        if (left) {
            if (start >= 0) {
                return list.get(start--);
            } else {
                left = false;
                if (index == 0)
                    start = index + 1;
                return list.get(start++);
            }
        }

        return list.get(start++);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return count < list.size();
    }

    public static void main(String[] args) {
        TreeNode tmp = new TreeNode(1);
        tmp.right = new TreeNode(2);
        BSTIterator bstIterator = new BSTIterator(tmp);
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());

    }


}
