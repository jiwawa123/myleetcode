package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/17
    time 8:40 AM
*/

import com.ji.algo.Util.ListNode;

public class AddTwoByListNode {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = myReverse(l1);
        ListNode t2 = myReverse(l2);
        int next = 0;
        ListNode head = new ListNode(0);
        ListNode tmp = head;
        while (t1 != null && t2 != null) {
            tmp.next = new ListNode((t1.val + t2.val + next) % 10);
            next = tmp.next.val / 10;
            tmp = tmp.next;
            t1 = t1.next;
            t2 = t2.next;
        }
        while (t1 != null ) {
            tmp.next = new ListNode((t1.val  + next) % 10);
            next = tmp.next.val / 10;
            tmp = tmp.next;
            t1 = t1.next;
        }
        while ( t2 != null) {
            tmp.next = new ListNode((t2.val  + next) % 10);
            next = tmp.next.val / 10;
            tmp = tmp.next;
            t2 = t2.next;
        }
        if(next>0){
            tmp.next = new ListNode( next% 10);
        }
        return myReverse(head.next);

    }

    public ListNode myReverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
