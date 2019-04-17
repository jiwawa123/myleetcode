package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/17
    time 7:26 PM
*/

import com.ji.algo.Util.TreeLinkNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Connect {
    public static void main(String[] args) {

    }

    public void connect(TreeLinkNode root) {
        if (root == null)
            return;
        Queue<TreeLinkNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<TreeLinkNode> list = new ArrayList();
            Queue<TreeLinkNode> que = new LinkedList();
            while (!queue.isEmpty()) {
                TreeLinkNode tp = queue.remove();
                list.add(tp);
                if (tp.left != null) {
                    que.add(tp.left);
                }
                if (tp.right != null) {
                    que.add(tp.right);
                }
            }
            for (int i = 0; i < list.size() - 1; i++) {
                list.get(i).next = list.get(i + 1);
            }
            queue = que;
        }
    }
}
