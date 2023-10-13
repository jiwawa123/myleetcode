package com.ji.ready202309;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/11/22:25
 */
public class L052 {
    public static void main(String[] args) {

    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0, b = 0;
        ListNode p = headA, q = headB;
        while (p != null) {
            p = p.next;
            a++;
        }
        while (q != null) {
            q = q.next;
            b++;
        }

        int t = Math.abs(a - b);
        if (a > b) {

            while (headA != headB && headA != null) {
                if (t > 0) {
                    t--;
                    headA = headA.next;
                } else {
                    headA = headA.next;
                    headB = headB.next;
                }
            }
            return headA;
        } else {
            while (headA != headB && headA != null) {
                if (t > 0) {
                    t--;
                    headB = headB.next;
                } else {
                    headA = headA.next;
                    headB = headB.next;
                }
            }
            return headA;
        }
    }
}
