package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/8
    time 9:03 PM
*/

import com.ji.algo.Util.ListNode;

public class MergeTwoLists {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tmp = head;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                ListNode tp = new ListNode(l1.val);
                tmp.next = tp;
                tmp = tp;
                l1 = l1.next;
            }else{
                ListNode tp = new ListNode(l2.val);
                tmp.next = tp;
                tmp = tp;
                l2 = l2.next;
            }
        }
        while(l1!=null){
            ListNode tp = new ListNode(l1.val);
            tmp.next = tp;
            tmp = tp;
            l1 = l1.next;
        }
        while(l2!=null){
            ListNode tp = new ListNode(l2.val);
            tmp.next = tp;
            tmp = tp;
            l2 = l2.next;
        }
        return head.next;
    }
}
