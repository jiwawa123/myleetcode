package com.ji.algo.G0726;

import com.ji.algo.Util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/7/26
 * time 10:16 上午
 */
public class G3 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        long a = System.currentTimeMillis();
        System.out.println(new G3().countPairs(root, 3));
        System.out.println(System.currentTimeMillis() - a);
    }

    int res = 0;

    public int countPairs(TreeNode root, int distance) {
        countPairsII(root, distance);
        return res;
    }

    public void countPairsII(TreeNode root, int distance) {
        if (root == null) {
            return;
        }
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        help(left, 1, root.left);
        help(right, 1, root.right);

        for (Map.Entry<Integer, Integer> l : left.entrySet()
        ) {
            for (Map.Entry<Integer, Integer> r : right.entrySet()
            ) {
                if (l.getKey() + r.getKey() <= distance) {
                    System.out.println(root.val);
                    System.out.println(l.getKey());
                    System.out.println(r.getKey());

                    System.out.println("======");
                    res += l.getValue() * r.getValue();
                }
            }
        }
        countPairsII(root.left, distance);
        countPairsII(root.right, distance);
    }

    public void help(Map<Integer, Integer> map, int dep, TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            map.put(dep, map.getOrDefault(dep, 0) + 1);
            return;
        }
        help(map, dep + 1, root.right);
        help(map, dep + 1, root.left);
    }
}
