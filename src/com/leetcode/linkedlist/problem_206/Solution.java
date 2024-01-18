package com.leetcode.linkedlist.problem_206;

//Given the head of a singly linked list, reverse the list, and return the reversed list.

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*recursively*/
    public ListNode reverseList(ListNode head){
        return reverseList(head, null);
    }

    private ListNode reverseList(ListNode head, ListNode newHead){

        if(head == null){
            return newHead;
        }

        ListNode next = head.next;
        head.next = newHead;

        return reverseList(next, head);
    }

    /*iteratively
        public ListNode reverseList(ListNode head){

        List<Integer> list = new ArrayList();

        ListNode tmp = head;

        while(tmp != null){
            list.add(tmp.val);
            tmp = tmp.next;
        }

        tmp = head;

        for (int i = list.size() - 1; i >= 0; i--) {
            tmp.val = list.get(i);
            tmp = tmp.next;
        }
        return head;
    }*/
}
