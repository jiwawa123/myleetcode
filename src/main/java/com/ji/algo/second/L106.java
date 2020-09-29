package com.ji.algo.second;

import com.ji.algo.Util.TreeNode;

/**
 * user ji
 * data 2020/9/25
 * time 9:26 下午
 */
public class L106 {
    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder, postorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] inorder, int[] postorder, int postEnd, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        int currentVal = postorder[postEnd];
        TreeNode current = new TreeNode(currentVal);

        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == currentVal) {
                inIndex = i;
            }
        }
        TreeNode left = helper(inorder, postorder, postEnd - (inEnd- inIndex) - 1, inStart, inIndex - 1);
        TreeNode right = helper(inorder, postorder, postEnd - 1, inIndex + 1, inEnd);
        current.left = left;
        current.right = right;
        return current;
    }

}
