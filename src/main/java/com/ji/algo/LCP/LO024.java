package com.ji.algo.LCP;

import com.ji.algo.Util.ListNode;

import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/09/22:56
 */
public class LO024 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(3);
        node.next.next.next.next.next.next = new ListNode(2);
        node.next.next.next.next.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(node));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null && head.next == null) {
            return true;
        }
        ListNode p = head;
        ListNode q = head.next;
        while (p != null && q != null && null != q.next) {
            p = p.next;
            q = q.next.next;
        }

        ListNode tail = reverseList(p.next);
        while (head != null && tail != null) {
            if (head.val != tail.val) {
                return false;
            }
            tail = tail.next;
            head = head.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = null;
        while (head != null) {
            ListNode next = head.next;
            ListNode t = head;
            t.next = p;
            p = t;
            head = next;
        }
        return p;
    }
}
