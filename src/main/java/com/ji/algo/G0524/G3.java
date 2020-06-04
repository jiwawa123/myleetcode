package com.ji.algo.G0524;

import com.ji.algo.Util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/5/24
 * time 10:59 上午
 */
public class G3 {
    public static void main(String[] args) {

    }

    int res = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        help(root, new HashMap<>());
        return res;
    }

    public void help(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        if (map.containsKey(root.val)) {
            map.remove(root.val);
        } else {
            map.put(root.val, 1);
        }
        if (root.left == null && root.right == null) {
            if (map.size() <= 1) {
                res++;
            }
            return;
        }
        help(root.left, new HashMap<>(map));
        help(root.right, new HashMap<>(map));
    }
}
