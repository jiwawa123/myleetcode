package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/3
    time 4:59 PM
*/

import com.ji.algo.Util.ListNode;

import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //判断两个链表都是空的情况,直接遍历即可，和合并数组类似
        if (l1 == null && l2 == null)
            return null;
        ListNode target = new ListNode(0);
        ListNode p = target;
        int ne = 0;
        while (l1 != null && l2 != null) {
            int tmp = (ne + l1.val + l2.val) % 10;
            ne = (ne + l1.val + l2.val) / 10;
            ListNode pp = new ListNode(tmp);
            p.next = pp;
            p = pp;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int tmp = (ne + l1.val) % 10;
            ne = (ne + l1.val) / 10;
            ListNode pp = new ListNode(tmp);
            p.next = pp;
            p = pp;
            l1 = l1.next;

        }
        while(l2!=null){
            int tmp = (ne + l2.val) % 10;
            ne = (ne + l2.val) / 10;
            ListNode pp = new ListNode(tmp);
            p.next = pp;
            p = pp;
            l2 = l2.next;
        }
        if(ne!=0){
            ListNode pp = new ListNode(ne);
            p.next = pp;
        }
        return target.next;
    }
}
