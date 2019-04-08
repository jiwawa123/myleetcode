package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/8
    time 1:52 PM
*/

import com.ji.algo.Util.ListNode;

public class RemoveNthFromEnd {
    public static void main(String[] args) {

    }
    //直接跳过这个字段即可
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //第一次遍历找长度
        int len = 0;
        ListNode p = head;
        while(p!=null){
            len++;
            p = p.next;
        }
        int tmp = 0;
        ListNode root = new ListNode(0);
        ListNode pp = root;
        while(tmp<len){
            if(tmp!=len-n){
                pp.next = new ListNode(head.val);
                pp = pp.next;
            }
            head = head.next;
        }
        return root.next;
    }
}
