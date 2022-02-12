package com.ji.algo.offer;

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2022/02/12/下午9:05
 */
public class O56 {
    public static void main(String[] args) {

    }

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        print(root, list);
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }

    public void print(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        print(root.left, list);
        list.add(root.val);
        print(root.right, list);

    }
}
