/**
* Created by holten on 2018-03-22.
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
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode forward = head;
        if (k < 1) {
            return null;
        }
        for (int i = 1; i < k; i++) {
            if(forward.next==null){
                return null;
            }
            forward = forward.next;
        }
        while (forward.next!=null){
            forward=forward.next;
            head=head.next;
        }
        return head;
    }
}