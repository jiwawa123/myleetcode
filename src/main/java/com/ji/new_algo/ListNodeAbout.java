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


    //2019-09-18 ListNode 反转 非递归使用
    public ListNode reverIII(ListNode node) {
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

    //反转使用递归操作
    public ListNode reverIV(ListNode node) {
        if (node == null || node.next == null)
            return node;
        ListNode tmp = reverIV(node);
        node.next.next = node;
        node.next = null;
        return tmp;
    }
}
