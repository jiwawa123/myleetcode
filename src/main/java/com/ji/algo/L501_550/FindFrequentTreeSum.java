package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/9
    time 5:25 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class FindFrequentTreeSum {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(1);
        t1.right = new TreeNode(5);
        t1.left.left = new TreeNode(0);
        t1.left.right = new TreeNode(2);
        t1.left.right.right = new TreeNode(3);
        t1.right.left = new TreeNode(4);
        t1.right.right = new TreeNode(6);
        new FindFrequentTreeSum().findFrequentTreeSum(t1);

    }

    Map<Integer, Integer> map = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null)
            return new int[0];
        help(root);
        Map<Integer, Integer> tmp = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        List<Integer> list = new LinkedList<>();
        int k = 0;
        for (int kk : tmp.keySet()
                ) {
            if (tmp.get(kk) >= k) {
                k = tmp.get(kk);
                list.add(kk);
            } else {
                break;
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public void help(TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            map.put(root.val, map.getOrDefault(root.val, 0) + 1);
            return;
        }
        int sum = root.val + sum(root.left) + sum(root.right);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return;
    }

    public int sum(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            map.put(root.val, map.getOrDefault(root.val, 0) + 1);
            return root.val;
        }
        int sum = root.val + sum(root.left) + sum(root.right);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;

    }

}
