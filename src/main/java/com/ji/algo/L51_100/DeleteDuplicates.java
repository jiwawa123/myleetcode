package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/10
    time 8:08 AM
*/

import com.ji.algo.Util.ListNode;

public class DeleteDuplicates {
    public ListNode deleteDuplicatesI(ListNode head) {
        if(head==null||head.next==null)
            return head;
        int tmp = head.val;
        ListNode p = new ListNode(tmp);
        ListNode q = p;
        while(head.next!=null){
            head = head.next;
            if(head.val!=tmp){
                ListNode t = new ListNode(head.val);
                tmp = head.val;
                q.next = t;
                q = t;
            }
        }
        return p;
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if(head.val == head.next.val) head = head.next;
        return head;
    }
}
