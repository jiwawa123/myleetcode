package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/10
    time 8:17 AM
*/

import com.ji.algo.Util.ListNode;

public class DeleteDuplicatesII {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        int tmp = head.val;
        boolean flag = true;
        ListNode p = new ListNode(0);
        ListNode q = p;
        while(head.next!=null){
            head = head.next;
            if(tmp!=head.val&&flag){
                ListNode t = new ListNode(tmp);
                q.next = t;
                q = t;
                tmp = head.val;
                flag = true;
            }else{
                flag = false;
            }
        }
        if(flag){
            ListNode t = new ListNode(tmp);
            q.next = t;
        }
        return p.next;
    }
}
