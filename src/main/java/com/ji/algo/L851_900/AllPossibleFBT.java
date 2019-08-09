package com.ji.algo.L851_900;/*
    user ji
    data 2019/8/9
    time 2:16 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllPossibleFBT {

    Map<Integer, List<TreeNode>> map = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int N) {
        if(map.containsKey(N))
            return map.get(N);
        List<TreeNode> root = new ArrayList<>();
        if (N == 0)
            return root;
        if (N == 1) {
            root.add(new TreeNode(0));
            return root;
        }
        for (int i = 1; i < N - 1; i++) {
            List<TreeNode> left = map.getOrDefault(i,allPossibleFBT(i));
            List<TreeNode> right = map.getOrDefault(N - i - 1,allPossibleFBT(i));
            for (int j = 0; j < left.size(); j++) {
                for (int k = 0; k < right.size(); k++) {
                    TreeNode ll = new TreeNode(0);
                    ll.left = left.get(j);
                    ll.right = right.get(k);
                    root.add(ll);
                }
            }
        }
        map.put(N, root);
        return root;
    }
}
