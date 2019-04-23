package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 7:36 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllPath {
    public static void main(String[] args) {

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root==null)
            return list;
        help_path(list,"",root);
        return list;
    }
    public void help_path(List<String> list,String tmp,TreeNode root){
        if(root.left==null&&root.right==null){
            if(tmp.equals(""))
                list.add(root.value+"");
            else
                list.add(tmp+"->"+root.value);
            return;
        }
        if(root.left!=null){
            if(tmp.equals(""))
                help_path(list,""+root.value,root.left);
            else
                help_path(list,tmp+"->"+root.value,root.left);
        }
        if(root.right!=null){
            if(tmp.equals(""))
                help_path(list,""+root.value,root.right);
            else
                help_path(list,tmp+"->"+root.value,root.right);
        }
    }
}
