package com.ji.base;/*
    user ji
    data 2019/6/14
    time 9:14 PM
*/

import com.ji.algo.Util.ListNode;

public class AboutListNode {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode tmp = new ListNode(head.val);
        int val = tmp.val;
        ListNode next = tmp;
        while (head.next != null) {
            head = head.next;
            if (head.val != val) {
                next.next = new ListNode(head.val);
                val = head.val;
            }
        }
        return tmp;


    }
}
