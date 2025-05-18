package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/6/14
    time 4:59 PM
*/

import com.ji.algo.Util.TreeNode;
import com.ji.new_algo.ArrayAbout;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BstFromPreorder {
    public static void main(String[] args) {
        int arr[] = {8, 5, 1, 7, 10, 12};
        new BstFromPreorder().bstFromPreorder(arr);
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        List<Integer> list = new ArrayList<>();
        for (int k : preorder
                ) {
            list.add(k);
        }
        return bstFromPreorder(list);
    }

    public TreeNode bstFromPreorder(List<Integer> list) {
        if (list.size() == 0)
            return null;
        TreeNode root = new TreeNode(list.get(0));
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(0)) {
                right.add(list.get(i));
            } else {
                left.add(list.get(i));
            }
        }
        root.left = bstFromPreorder(left);
        root.right = bstFromPreorder(right);
        return root;
    }
}
