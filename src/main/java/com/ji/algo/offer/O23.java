package com.ji.algo.offer;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/12/下午12:00
 */
public class O23 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode nodeA = headA, nodeB = headB;
        while (nodeA != nodeB) {
            nodeA = (nodeA == null) ? headB : nodeA.next;
            nodeB = (nodeB == null) ? headA : nodeB.next;
        }
        return nodeA;
    }
}
