package com.ji.algo.wyII;


import java.util.Scanner;

/**
 * user ji
 * data 2020/9/12
 * time 2:59 下午
 */
public class G1 {

    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        TreeNode[] arr = new TreeNode[m + 1];
        for (int i = 1; i < arr.length ; i++) {
            arr[i] = new TreeNode(i);
        }
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            String d = sc.next();
            int end = sc.nextInt();
            if (d.equals("left")) {
                arr[start].left = arr[end];
            } else {
                arr[start].right = arr[end];
            }
        }
        help(arr[1]);
        System.out.println(res);
    }

    public static void help(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null && root.right != null) {
            if (isOne(root.left) && isOne(root.right))
                res++;
        }
        help(root.left);
        help(root.right);
    }

    public static boolean isOne(TreeNode root) {
        if (root == null)
            return false;
        return root.left == null && root.right == null;
    }
}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

}