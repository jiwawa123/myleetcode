package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 8:29 PM
*/

import com.ji.algo.Util.ListNode;

public class InsertionSortList {
    public static void main(String[] args) {

    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null)
            return null;
        ListNode p = new ListNode(0);
        ListNode newhead = p;
        p.next = head;
        ListNode pre = head;
        ListNode q = head.next;
        while (q != null) {
            while (p.next != null && p.next.val < q.val && p.next != q) {
                p = p.next;
            }
            if (p.next == q) {
                pre = q;
                q = q.next;
                p = newhead;
            } else {
                pre.next = q.next;
                q.next = p.next;
                p.next = q;
                q = pre.next;
                p = newhead;
            }
        }
        return p.next;
    }
}
