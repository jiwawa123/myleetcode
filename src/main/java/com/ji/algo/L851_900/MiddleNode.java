package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/24
    time 11:49 AM
*/

import com.ji.algo.Util.ListNode;

public class MiddleNode {
    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        ListNode q = head;
        while (p.next != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }
        return p;
    }
}
