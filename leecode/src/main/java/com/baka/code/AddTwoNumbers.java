package com.baka.code;

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {return l2;}
        if (l2 == null) {return l1;}

        ListNode listNode = null;
        if (l1.val <= l2.val){
            listNode = l1;
            listNode.next = addTwoNumbers(l1.next, l2);
        } else {
            listNode = l2;
            listNode.next = addTwoNumbers(l1, l2.next);
        }
        return listNode;
    }
}
