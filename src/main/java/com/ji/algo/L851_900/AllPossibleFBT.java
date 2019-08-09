package com.ji.algo.L851_900;/*
    user ji
    data 2019/8/9
    time 2:16 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleFBT {

    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> root = new ArrayList<>();
        if (N == 0)
            return root;
        if (N == 1) {
            root.add(new TreeNode(0));
            return root;
        }
        for (int i = 1; i < N - 1; i++) {

            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(N - i - 1);
            for (int j = 0; j < left.size(); j++) {
                for (int k = 0; k < right.size(); k++) {
                    TreeNode ll = new TreeNode(0);
                    ll.left = left.get(j);
                    ll.right = right.get(k);
                    root.add(ll);
                }
            }
        }
        return root;
    }
}
