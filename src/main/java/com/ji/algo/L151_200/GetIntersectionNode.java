package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/16
    time 9:35 AM
*/

import com.ji.algo.Util.ListNode;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0, len2 = 0;
        ListNode a = headA;
        ListNode b = headB;
        while (a != null) {
            a = a.next;
            len1++;
        }
        while (b != null) {
            b = b.next;
            len2++;
        }
        if (len1 > len2) {
            int tmp = len1 - len2;
            while (tmp > 0) {
                headA = headA.next;
            }
            while (headA != null && headB != null) {
                if (headA == headB)
                    return headA;
                else {
                    headA = headA.next;
                    headB = headB.next;
                }
            }
        }else{
            int tmp = len2 - len1;
            while (tmp > 0) {
                headB = headB.next;
            }
            while (headA != null && headB != null) {
                if (headA == headB)
                    return headA;
                else {
                    headA = headA.next;
                    headB = headB.next;
                }
            }
        }
        return null;
    }
}
