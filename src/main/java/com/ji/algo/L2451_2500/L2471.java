package com.ji.algo.L2451_2500;

import com.ji.algo.Util.TreeNode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @Author: Bei Chang
 * @Date: 2022/11/22/下午10:14
 */
public class L2471 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(switchMin(arr));
    }

    public static int minimumOperations(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (queue.size() > 0) {
            int n = queue.size(), i = 0;
            int[] nums = new int[n];
            while (n-- > 0) {
                TreeNode node = queue.poll();
                nums[i++] = node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res += switchMin(nums);
        }
        return res;
    }

    public static int switchMin(int[] arr) {
        int[] tmp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < tmp.length; j++) {
                if (tmp[j] == arr[i]) {
                    if (arr[i] == tmp[j]) {
                        if (i == j) {
                            break;
                        } else {
                            res += 1;
                            int k = tmp[i];
                            tmp[i] = arr[i];
                            tmp[j] = k;

                        }

                    }
                }
            }
        }
        return res;

    }
}
