package com.ji.algo.L201_250;/*
    user ji
    data 2019/6/19
    time 8:04 AM
*/

import com.ji.algo.Util.ListNode;

public class RemoveElement {
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode cur = header;
        while(cur.next != null){
            if(cur.next.val == val ){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return header.next;
    }
}
