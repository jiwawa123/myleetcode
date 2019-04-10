package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/10
    time 9:06 AM
*/

import com.ji.algo.Util.ListNode;

public class Partition {
    public static void main(String[] args) {

    }

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        ListNode t1 = new ListNode(0);
        ListNode t2 = new ListNode(0);
        ListNode p1 = t1;
        ListNode p2 = t2;
        while(head!=null){
            ListNode tmp = new ListNode(head.val);
            if(head.val<x){
                p1.next = tmp;
                p1 = tmp;
            }else{
                p2.next = tmp;
                p2 = tmp;
            }
            head = head.next;
        }
        p1.next = t2.next;
        return t1.next;
    }
}
