package com.ji.algo.L51_100;
/*
    user ji
    data 2019/4/10
    time 2:26 PM
*/

import com.ji.algo.Util.ListNode;

import java.util.Stack;

public class ReverseBetween {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int i = 1; i < 5; i++) {
            ListNode pp = new ListNode(i);
            p.next = pp;
            p = pp;
        }
        reverseBetween(head,2,4);

    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        int index = 1;
        ListNode p = new ListNode(0);
        ListNode q = p;
        Stack<Integer> stack = new Stack();
        while (index < n) {
            if (index < m) {
                ListNode tmp = new ListNode(head.val);
                q.next = tmp;
                q = tmp;
            } else {
                stack.add(head.val);
            }
            index++;
            head = head.next;
        }
        while (!stack.isEmpty()) {
            ListNode tmp = new ListNode(stack.pop());
            q.next = tmp;
            q = tmp;
        }
        q.next = head;
        return p.next;
    }
}
