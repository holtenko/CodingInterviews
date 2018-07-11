/**
* Created by holten on 2018-07-11.
* Email: holten.ko@foxmail.com
*/

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode reverseHead = null;
        ListNode now = head;
        ListNode prev = null;
        while(now!=null){
            ListNode next = now.next;
            if(next==null) reverseHead = now;
            now.next = prev;
            prev = now;
            now = next;
        }
        return reverseHead;
    }
}