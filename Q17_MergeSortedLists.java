/**
* Created by holten on 2019-02-12.
* Email: holten.ko@foxmail.com
*/

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode newListHead = null;
        ListNode newListTail = null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (newListHead == null) {
                    newListHead = list1;
                    newListTail = list1;
                } else {
                    newListTail.next = list1;
                    newListTail = newListTail.next;
                }
                list1 = list1.next;
            } else {
                if (newListHead == null) {
                    newListHead = list2;
                    newListTail = list2;
                } else {
                    newListTail.next = list2;
                    newListTail = newListTail.next;
                }
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            newListTail.next = list2;
        } else {
            newListTail.next = list1;
        }
        return newListHead;
    }
}