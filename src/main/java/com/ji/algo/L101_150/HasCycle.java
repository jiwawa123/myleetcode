package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 4:37 PM
*/

import com.ji.algo.Util.ListNode;

public class HasCycle {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode p = head;
        ListNode q = head.next.next;
        while (p != null && q != null) {
            if (p == q)
                return true;
            p = p.next;
            if (q.next == null)
                return false;
            q = q.next.next;
        }
        return false;
    }
}
