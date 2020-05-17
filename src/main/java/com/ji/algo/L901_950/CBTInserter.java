package com.ji.algo.L901_950;/*
    user ji
    data 2019/8/13
    time 9:24 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.*;

public class CBTInserter {


    //层次遍历，每次插入的时候选择第几层，第几个节点的左右孩子
    Map<Integer, List<TreeNode>> dep;
    TreeNode root;
    int height;

    public CBTInserter(TreeNode root) {
        height = 0;
        this.root = root;
        dep = new HashMap<>();
        TreeNode tmp = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tmp);
        while (!queue.isEmpty()) {
            height++;
            List<TreeNode> list = new ArrayList<>();
            Queue<TreeNode> que = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.remove();
                list.add(node);
                if (node.left != null)
                    que.add(node.left);
                if (node.right != null)
                    que.add(node.right);
            }
            dep.put(height, list);
            queue = que;
        }
    }

    public int insert(int v) {
        int size = dep.get(height).size();
        int all = (int) Math.pow(2, height - 1);
        if (size == all) {
            int res = dep.get(height).get(0).val;
            TreeNode tmp = dep.get(height).get(0);
            TreeNode l = new TreeNode(v);
            tmp.left = l;
            height += 1;
            List<TreeNode> list = new ArrayList<>();
            list.add(l);
            dep.put(height, list);
            return res;
        } else {
            List<TreeNode> list = dep.get(height);
            TreeNode tmp = new TreeNode(v);
            list.add(tmp);
            int len = list.size();
            int last = Math.max(0, (len + 1) / 2 - 1);
            TreeNode par = dep.get(height - 1).get(last);
            if (len % 2 == 0) {
                par.right = tmp;
            } else {
                par.left = tmp;
            }
            dep.put(height, list);
            return par.val;
        }
    }

    public TreeNode get_root() {
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        CBTInserter cbtInserter = new CBTInserter(root);
        System.out.println(cbtInserter.insert(2));
        System.out.println(cbtInserter.insert(3));
        System.out.println(cbtInserter.insert(4));
        System.out.println(cbtInserter.insert(5));
        System.out.println(cbtInserter.insert(6));
    }
}
