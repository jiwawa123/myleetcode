package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/09:02
 */
public class L236 {
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) {
            return root;
        }
        boolean pL = isContains(root, p);
        boolean qR = isContains(root, q);
        if (pL && qR) {
            return root;
        }

        boolean pR = isContains(root, p);
        boolean qL = isContains(root, q);
        if (pR && qL) {
            return root;
        }

        if (pL || qL) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (qR || pR) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return  null;

    }

    public boolean isContains(TreeNode root, TreeNode p) {
        if (root == null) return false;
        if (root == p) return true;
        return isContains(root.left, p) || isContains(root.right, p);
    }
}
