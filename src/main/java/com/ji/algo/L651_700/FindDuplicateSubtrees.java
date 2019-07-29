package com.ji.algo.L651_700;/*
    user ji
    data 2019/7/29
    time 6:52 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.*;

public class FindDuplicateSubtrees {
    public static void main(String[] args) {

    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<TreeNode> res = new ArrayList<TreeNode>();
        findDuplicateSubtrees(root, res, map);
        return res;
    }

    private StringBuilder findDuplicateSubtrees(TreeNode root, List<TreeNode> res, Map<String, Integer> map){
        if(root == null){
            return new StringBuilder("$");
        }
        StringBuilder left = findDuplicateSubtrees(root.left, res, map);
        StringBuilder right = findDuplicateSubtrees(root.right, res, map);
        //注意这里的加和顺序
        // StringBuilder treeKey = left.append(new StringBuilder(root.val + "")).append(right);
        StringBuilder treeKey = new StringBuilder(root.value + "").append(left).append(right);
        map.put(treeKey.toString(), map.getOrDefault(treeKey.toString(), 0) + 1);
        if(map.get(treeKey.toString()) == 2){
            res.add(root);
        }
        return treeKey;
    }

}
