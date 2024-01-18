package com.leetcode.linkedlist.problem_876;

/*Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.*/

class Solution {
    public ListNode middleNode(ListNode head) {

        if(head == null){
            return head;
        }

        int middle = getLengthLinkedList(head) / 2;

        while(middle > 0){
            head = head.next;
            middle--;
        }
        return head;
    }

    private int getLengthLinkedList(ListNode head){

        int count = 0;

        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }
}