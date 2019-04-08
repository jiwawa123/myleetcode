package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/8
    time 9:16 PM
*/

import com.ji.algo.Util.ListNode;

public class SwapPairs {
    public static void main(String[] args) {

    }
    //多定义变量，在进行两次遍历之后需要考虑是奇数个数的情况
    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        while(head!=null&&head.next!=null){
            ListNode t1 = new ListNode(head.next.val);
            ListNode t2 = new ListNode(head.val);
            t1.next = t2;
            tmp.next = t1;
            tmp = t2;
            head = head.next.next;
        }
        if(head!=null){
            ListNode tt = new ListNode(head.val);
            tmp.next = tt;
        }
        return head.next;
    }
    //大佬做法，一直递归
    public ListNode swapPairsII(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
