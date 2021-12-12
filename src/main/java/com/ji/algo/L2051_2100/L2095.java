package com.ji.algo.L2051_2100;

import com.ji.algo.Util.ListNode;

/**
 * @author ji
 * @data 2021/12/10
 * @time 8:45 下午
 */
public class L2095 {
    public static void main(String[] args) {

    }

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        ListNode q = head;
        ListNode l = null;
        while (q != null && q.next != null) {
            l = p;
            p = p.next;
            q = q.next.next;
        }

        l.next = p.next;
        return head;
    }

}
