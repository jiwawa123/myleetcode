package com.ji.algo.L301_350;/*
    user ji
    data 2019/4/24
    time 9:27 PM
*/

import com.ji.algo.Util.ListNode;

public class OddEvenList {
    public static void main(String[] args) {

    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = new ListNode(head.val);
        ListNode q = p;
        ListNode next = new ListNode(head.next.val);
        ListNode ne = next;
        boolean flag = true;
        head = head.next.next;
        while (head != null) {

            if(flag){
                q.next = new ListNode(head.val);;
                q = q.next;
                flag = !flag;
            }else{
                ne.next = new ListNode(head.val);;
                ne = ne.next;
                flag = !flag;
            }
            head = head.next;
        }
        q.next = next;
        return p;
    }
}
