package com.ji.algo.L551_600;/*
    user ji
    data 2019/5/12
    time 9:13 AM
*/

import com.ji.algo.Util.Node;

import java.util.Map;

public class MaxPathNNode {
    public static void main(String[] args) {

    }

    int count = 0;

    public int maxDepth(Node root) {

        help(root, 0);
        return count;
    }

    public void help(Node root, int dep) {
        if (root == null) {
            return;
        }
        count = Math.max(count, dep + 1);
        for (int i = 0; i < root.children.size(); i++) {
            help(root.children.get(i), dep + 1);
        }
    }

}
