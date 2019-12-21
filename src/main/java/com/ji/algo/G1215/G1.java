package com.ji.algo.G1215;/*
    user ji
    data 2019/12/15
    time 10:30 AM
*/

import com.ji.algo.Util.ListNode;

public class G1 {
    public static void main(String[] args) {
        System.out.println();
    }
    public int getDecimalValue(ListNode head) {
        if(head==null)
            return 0;
        StringBuilder sp = new StringBuilder();
        while(head!=null){
            sp.append(head.val);
            head = head.next;
        }
        return Integer.valueOf(sp.reverse().toString(),2);
    }
}
