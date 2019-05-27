package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/27
    time 9:22 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.*;

public class FindMode {
    public static void main(String[] args) {

    }

    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<TreeNode> statck = new Stack<>();
        List<Integer> tmp = new LinkedList<>();
        int count = 0;
        while (!statck.isEmpty() || root != null) {
            if (root != null) {
                map.put(root.value, map.getOrDefault(root.value, 0) + 1);
                statck.push(root);
                root = root.left;
            } else {
                root = statck.pop();
                root = root.right;
            }
        }
        for (int k : map.keySet()
                ) {
            if (map.get(k) > count) {
                tmp = new LinkedList<>();
                tmp.add(k);
                count = map.get(k);
            } else if (map.get(k) == count) {
                tmp.add(k);
            }
        }
        int res[] = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

}
