package com.ji.base;/*
    user ji
    data 2019/5/16
    time 10:26 AM
*/

import com.ji.algo.Util.ListNode;

public class SingleLinkNodeReverse {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode t = node;
        for (int i = 2; i < 5; i++) {
            t.next = new ListNode(i);
            t = t.next;
        }
        ListNode tmp = reverseList(node);
        while(tmp!=null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

    //循环方式
    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode oldHead = null;
        ListNode newHead = null;
        //始终让其往后面变动
        while (cur != null) {
            //记录状态
            oldHead = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = oldHead;
        }
        return newHead;
    }

    public static ListNode myReverse(ListNode head) {
        if (head == null)
            return head;
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = head;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    public static ListNode reverseList(ListNode pHead){
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        //保存中间节点，然后最后返回
        ListNode nowHead = reverseList(pHead.next);
        pHead.next.next=pHead;
        pHead.next=null;
        return nowHead;
    }
}
