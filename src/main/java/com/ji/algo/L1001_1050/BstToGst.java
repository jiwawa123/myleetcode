package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/7/25
    time 10:15 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BstToGst {
    List<Integer> list = new ArrayList();
    Map<Integer,Integer> map = new HashMap();
    public TreeNode bstToGst(TreeNode root) {
        if(root==null)
            return root;
        help(root);
        int sum = 0;
        for(int i = list.size()-1;i>=0;i--){
            sum += list.get(i);
            map.put(list.get(i),sum);
        }
        helpI(root);
        return root;
    }
    public void help(TreeNode root){
        if(root==null)
            return;
        help(root.left);
        list.add(root.val);
        help(root.right);
    }
    public void helpI(TreeNode root){
        if(root==null)
            return;
        root.val = map.get(root.val);
        helpI(root.left);
        helpI(root.right);
    }
}
