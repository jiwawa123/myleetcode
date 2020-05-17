package com.ji.algo.L401_450;/*
    user ji
    data 2019/7/28
    time 9:34 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codec {
    // Encodes a tree to a single string.
    List<Integer> pre = new ArrayList<>();
    List<Integer> post = new ArrayList<>();

    public String serialize(TreeNode root) {
        preOrder(root);
        postOrder(root);
        if (pre.size() == 0)
            return "";
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < pre.size(); i++) {
            sp.append(pre.get(i));
            if (i != pre.size() - 1)
                sp.append(" ");
        }
        sp.append("_");
        for (int i = 0; i < post.size(); i++) {
            sp.append(post.get(i));
            if (i != post.size() - 1)
                sp.append(" ");
        }
        return sp.toString();
    }

    public void preOrder(TreeNode root) {
        if (root == null)
            return;
        pre.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        post.add(root.val);
        postOrder(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals(""))
            return null;
        String arr[] = data.split("_");
        int size = arr[0].split(" ").length;
        int pre[] = new int[size];
        int post[] = new int[size];
        String arr_pre[] = arr[0].split(" ");
        String arr_post[] = arr[0].split(" ");
        for (int i = 0; i < size; i++) {
            pre[i] = Integer.valueOf(arr_pre[i]);
            post[i] = Integer.valueOf(arr_post[i]);
        }
        return buildTree(pre, post);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (null == preorder || preorder.length == 0)
            return null;
        if (preorder.length == 1)
            return new TreeNode(preorder[0]);
        TreeNode root = new TreeNode(preorder[0]);
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                index = i;
                break;
            }
        }
        int left[] = Arrays.copyOfRange(inorder, 0, index);
        int right[] = Arrays.copyOfRange(inorder, index + 1, inorder.length);
        int preLeft[] = Arrays.copyOfRange(preorder, 1, 1 + left.length);
        int preRight[] = Arrays.copyOfRange(preorder, 1 + preLeft.length, preorder.length);
        root.left = buildTree(preLeft, left);
        root.right = buildTree(preRight, right);
        return root;
    }

    public static void main(String[] args) {

    }
}
