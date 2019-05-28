package com.ji.algo.L951_1000;/*
    user ji
    data 2019/5/28
    time 2:08 PM
*/

import com.ji.algo.Util.TreeNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;

public class IsCousins {
    public static void main(String[] args) {

    }

    public boolean isCousins(TreeNode root, int x, int y) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer,Integer> depth = new HashMap<>();
        help(root, -1, map,depth,0);
        return map.get(x) != map.get(y)&&depth.get(x)==depth.get(y);
    }

    public void help(TreeNode root, int par, Map<Integer, Integer> map,Map<Integer,Integer> depth,int tmp) {
        if (root == null)
            return;
        else {
            map.put(root.value, par);
            depth.put(root.value,tmp);
            help(root.left, root.value, map,depth,tmp+1);
            help(root.right, root.value, map,depth,tmp+1);
        }
    }
}
