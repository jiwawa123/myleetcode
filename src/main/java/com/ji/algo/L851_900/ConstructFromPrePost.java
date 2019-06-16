package com.ji.algo.L851_900;/*
    user ji
    data 2019/6/16
    time 3:46 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.Arrays;

public class ConstructFromPrePost {
    public static void main(String[] args) {

    }

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        if (pre == null || pre.length == 0)
            return null;
        TreeNode root = new TreeNode(pre[0]);
        if (pre.length == 1)
            return root;
        int index = -1;
        for (int i = 0; i < post.length; i++) {
            if (post[i] == pre[1]) {
                index = i;
                break;
            }
        }
        root.left = constructFromPrePost(Arrays.copyOfRange(pre, 1, index + 2), Arrays.copyOfRange(post, 0, index + 1));
        root.right = constructFromPrePost(Arrays.copyOfRange(pre, index + 2, pre.length), Arrays.copyOfRange(post, index + 1, post.length - 1));
        return root;
    }
}
