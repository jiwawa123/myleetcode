package com.ji.algo.L301_350;

import com.ji.algo.Util.ListNode;

/**
 * user ji
 * data 2020/11/13
 * time 10:48 下午
 */
public class L328 {
    public static void main(String[] args) {

    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode o = head;
        ListNode p = head.next;
        ListNode e = p;
        while (o != null && e != null) {
            o.next = e.next;
            o = o.next;
            e.next = o.next;
            e = e.next;
        }
        o.next = p;
        return head;
    }
}
