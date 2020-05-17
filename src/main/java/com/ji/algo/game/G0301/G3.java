package com.ji.algo.game.G0301;/*
    user ji
    data 2020/3/1
    time 10:57 AM
*/

import com.ji.algo.Util.ListNode;
import com.ji.algo.Util.TreeNode;

public class G3 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(8);
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(8);
        System.out.println(new G3().isSubPath(listNode,root));
    }

    boolean path = false;
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head==null)
            return true;
        help(head,root);
        return path;
    }
    public void dfs(ListNode head, TreeNode root){
        if(root==null||path)
            return;
        help(head,root);
        dfs(head,root.left);
        dfs(head,root.left);
    }

    public void help(ListNode head, TreeNode root){
        if(path)
            return;
        if(head==null){
            path = true;
            return;
        }
        if(root==null)
            return;
        if(root.val !=head.val)
            return;
        help(head.next,root.left);
        help(head.next,root.right);
    }

}
