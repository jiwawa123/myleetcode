package com.ji.new_algo;/*
    user ji
    data 2019/6/5
    time 7:40 PM
*/

import com.ji.algo.Util.ListNode;

public class ListNodeAbout {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode tmp = reverII(node);
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

    public static ListNode rever(ListNode node) {
        if (node == null || node.next == null)
            return node;
        ListNode next = null;
        ListNode pre = null;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }

    public static ListNode reverII(ListNode node) {
        if (node == null || node.next == null)
            return node;
        ListNode tmp = rever(node.next);
        node.next.next = node;
        node.next = null;
        return tmp;
    }
}
