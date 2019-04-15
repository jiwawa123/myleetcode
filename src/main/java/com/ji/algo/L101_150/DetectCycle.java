package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 6:00 PM
*/

import com.ji.algo.Util.ListNode;

public class DetectCycle {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(0);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = l1.next;
        detectCycle(l1);

    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode p = head.next;
        ListNode q = head.next.next;
        while (p != null && q != null) {
            //已经存在环
            if (p == q) {
                while (head != q) {
                    head = head.next;
                    q = q.next;
                }
                return q;
            }
            p = p.next;
            if(q.next==null)
                break;
            q = q.next.next;
        }
        return null;
    }
}
