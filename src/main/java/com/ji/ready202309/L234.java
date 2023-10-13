package com.ji.ready202309;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/21:29
 */
public class L234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode p = head, q = head.next;
        while (p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }

        ListNode n = p.next;
        p.next = null;
        ListNode tmp = reverse(n);
        while (tmp != null) {
            if (tmp.val != head.val) {
                return false;
            }
            tmp = tmp.next;
            head = head.next;
        }


        return true;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = res;
            res = head;
            head = next;
        }
        return res;
    }
}
