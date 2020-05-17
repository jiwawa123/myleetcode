package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/14
    time 11:55 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        help(list,tmp,root,sum);
        return list;
    }
    public void help(List<List<Integer>> re,List<Integer> tmp ,TreeNode root,int sum){
        if(root==null)
            return;
        if(root.val ==sum&&root.left==null&&root.right==null)
        {
            tmp.add(root.val);
            re.add(new ArrayList<>(tmp));
        }else{
            tmp.add(root.val);
            help(re,new ArrayList<>(tmp),root.left,sum - root.val);
            help(re,new ArrayList<>(tmp),root.right,sum - root.val);
        }
    }
}
