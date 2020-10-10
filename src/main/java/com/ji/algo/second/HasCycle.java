package com.ji.algo.second;

import com.ji.algo.Util.ListNode;

/**
 * user ji
 * data 2020/10/10
 * time 7:52 上午
 */
public class HasCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(0);
        ListNode head3 = new ListNode(-4);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head1;
        new HasCycle().detectCycle(head);
    }
    public ListNode detectCycle(
            ListNode head) {
        if(head==null||head.next==null)
            return null;

        ListNode p = head;
        ListNode q = head.next;
        while(p!=null&&q!=null&&q.next!=null){
            //表示存在环
            if(p==q){
                q = q.next;
                while(head!=q){
                    head = head.next;
                    q = q.next;
                }
                return head;
            }
            p = p.next;
            q = q.next.next;
        }
        return null;
    }
}
