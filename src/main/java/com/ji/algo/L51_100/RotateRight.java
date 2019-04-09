package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 2:35 PM
*/

import com.ji.algo.Util.ListNode;

public class RotateRight {
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0)
            return head;
        ListNode p = head;
        ListNode tail = null;
        int len = 1;
        while(p.next!=null){
            p = p.next;
            len++;
        }
        tail = p;
        p.next = head;
        p = head;
        int index = len - (len%k);
        for (int i = 0; i < index; i++) {
            p = p.next;
            tail = tail.next;
        }
        tail.next = null;
        return p;
    }
}
