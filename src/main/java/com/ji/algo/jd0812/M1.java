package com.ji.algo.jd0812;

import com.ji.algo.Util.ListNode;
import com.ji.algo.Util.TreeNode;

import java.util.Stack;

/**
 * user ji
 * data 2020/8/12
 * time 3:41 下午
 */
public class M1 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        ListNode tmp = rerverseListNode(listNode);
        while(tmp!=null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }

    }

    public static void inOrder(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                root = stack.pop();
                System.out.println(root.val);
                root = root.right;
            }
        }
    }


    public static ListNode rerverseListNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = cur;
            cur = head;
            head = tmp;
        }

        return cur;
    }
}
