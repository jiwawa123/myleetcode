package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/22
    time 8:05 PM
*/

import com.ji.algo.Util.ListNode;

public class DeleteNode {
    public static void main(String[] args) {

    }
    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
