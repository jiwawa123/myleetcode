package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/4
    time 10:21 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class FindSecondMinimumValue {
    public static void main(String[] args) {

    }

    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> statck = new Stack<>();
        while (!statck.isEmpty() || root != null) {
            if (root != null) {
                statck.push(root);
                root = root.left;
            } else {
                root = statck.pop();
                list.add(root.value);
                root = root.right;
            }
        }
        Collections.sort(list);
        int tmp = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > tmp)
                return list.get(i);
        }
        return -1;
    }
}
