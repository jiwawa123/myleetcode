package com.ji.algo.L951_1000;/*
    user ji
    data 2019/6/28
    time 9:12 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SmallFromLeft {
    public static void main(String[] args) {
        int a = 25;
        System.out.println((char) (a + 'a'));
    }

    List<String> res = new ArrayList<>();

    public String smallestFromLeaf(TreeNode root) {
        if (root == null)
            return "";
        helper(root, "");
        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return res.get(0);
    }

    public void helper(TreeNode root, String str) {
        if (root == null)
            return;
        StringBuilder sp = new StringBuilder();
        sp.append((char) (root.val + 'a'));
        sp.append(str);
        if (root.left == null || root.right == null) {
            res.add(sp.toString());
            return;
        }
        helper(root.left, sp.toString());
        helper(root.right, sp.toString());
    }
}
