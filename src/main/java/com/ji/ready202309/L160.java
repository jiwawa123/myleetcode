package com.ji.ready202309;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/08:52
 */
public class L160 {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int aLen = 0, bLen = 0;
        while (a != null) {
            aLen++;
            a = a.next;
        }
        while (b != null) {
            bLen++;
            b = b.next;
        }
        ListNode p = headA, q = headB;
        int diff = Math.abs(aLen - bLen);
        if (aLen > bLen) {
            while (diff > 0) {
                p = p.next;
                diff--;
            }
        } else {
            while (diff > 0) {
                q = q.next;
                diff--;
            }
        }
        while (p != null && q != null) {
            if (p == q) {
                return p;

            }
            p = p.next;
            q = q.next;
        }
        return null;
    }
}
