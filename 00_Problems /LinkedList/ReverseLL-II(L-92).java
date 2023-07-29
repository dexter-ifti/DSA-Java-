https://leetcode.com/problems/reverse-linked-list-ii/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; i < left-1 && current != null; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        ListNode next = current.next;
        for (int i = 0; i < right - left + 1 && current != null; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
}
/*
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
*/
