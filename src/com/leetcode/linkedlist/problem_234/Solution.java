package com.leetcode.linkedlist.problem_234;

/*Given the head of a singly linked list, return true if it is a
palindrome or false otherwise. */

public class Solution {
    public boolean isPalindrome(ListNode head){

        ListNode copy = getCopyLinkedList(head);
        ListNode reverseLinkedList = getReverseLinkedList(copy, null);

        while(head != null){

            if(head.val != reverseLinkedList.val){
                return false;
            }
            head = head.next;
            reverseLinkedList = reverseLinkedList.next;
        }
        return true;
    }

    private ListNode getReverseLinkedList(ListNode head, ListNode newHead){

        if(head == null){
            return newHead;
        }
        ListNode next = head.next;
        head.next = newHead;

        return getReverseLinkedList(next, head);
    }

    private ListNode getCopyLinkedList(ListNode head){

        ListNode copy = new ListNode(head.val);
        ListNode tmpHead = head, tmpCopy = copy;

        while(tmpHead.next != null){
            tmpHead = tmpHead.next;

            while(tmpCopy.next != null){
                tmpCopy = tmpCopy.next;
            }
            tmpCopy.next = new ListNode(tmpHead.val);
        }
        return copy;
    }
}