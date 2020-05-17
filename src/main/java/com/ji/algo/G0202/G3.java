package com.ji.algo.G0202;/*
    user ji
    data 2020/2/2
    time 10:27 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class G3 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(new G3().maxProduct(root));
    }

    long tmp = 0;
    long sum = 0;
    Map<TreeNode, Long> map = new HashMap<>();

    public int maxProduct(TreeNode root) {
        help(root);
        for (Long t : map.values()
                ) {
            tmp = Math.max((sum - t) * t, tmp);
        }
        return (int) (tmp % (Math.pow(10, 9) + 7));
    }

    public int help(TreeNode root) {
        if (root == null) {
            return 0;
        }
        sum += root.val;
        int left = help(root.left);
        int right = help(root.right);
        int val = left + right + root.val;
        map.put(root, val*1L);
        return val;
    }


}
