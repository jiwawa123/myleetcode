package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/10
    time 9:19 PM
*/

import com.ji.algo.Util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(null==lists||lists.length==0)
            return null;
        ListNode head = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head = mergeTwoLists(head,lists[i]);
        }
        return head;

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
    public ListNode mergeKListsII(ListNode[] lists){
        if(lists.length == 0)
            return null;
        if(lists.length == 1)
            return lists[0];
        if(lists.length == 2){
            return mergeTwoLists(lists[0],lists[1]);
        }

        int mid = lists.length/2;
        ListNode[] l1 = new ListNode[mid];
        for(int i = 0; i < mid; i++){
            l1[i] = lists[i];
        }

        ListNode[] l2 = new ListNode[lists.length-mid];
        for(int i = mid,j=0; i < lists.length; i++,j++){
            l2[j] = lists[i];
        }

        return mergeTwoLists(mergeKListsII(l1),mergeKListsII(l2));

    }
}
