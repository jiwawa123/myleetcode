package com.ji.algo.tx;

import com.ji.algo.Util.TreeNode;

/**
 * user ji
 * data 2020/12/7
 * time 6:39 下午
 */
public class G6 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);
        // 二叉树 1。左右 2。右左 3.根结点就是目标节点；4.极端的二叉树【ListNode. 5 root为null;
//        root.right = new TreeNode(4);
//        root.right.right = new TreeNode(5);
//        System.out.println(find(root, 3, 2).val);
//        System.out.println(find(null, 3, 2).val);
//        System.out.println(find(root, 3, 2).val);
//        System.out.println(find(null, 3, 2).val);
    }

    public static TreeNode find(TreeNode root, int a, int b) {
        if (root == null || root.val == a || root.val == b)
            return root;
        TreeNode l = find(root.left, a, b);
        TreeNode r = find(root.right, a, b);
        if (l != null && r != null)
            return root;
        if (l != null)
            return l;
        return r;
    }
}
