package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/9
    time 4:59 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindBottomLeftValue {
    public static void main(String[] args) {

    }

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            list = new ArrayList<>();
            Queue<TreeNode> que = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode tmp = queue.remove();
                list.add(tmp.val);
                if (tmp.left != null)
                    que.add(tmp.left);
                if (tmp.right != null)
                    que.add(tmp.right);
            }
            queue = que;
        }
        return list.get(0);

    }
}
