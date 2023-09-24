/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        if(headA == headB){
            return headA;
        }
        ListNode temp = headA;
        ListNode tem = headB;
        while((temp != null && tem != null)){
            if(temp.next == tem) {
                return tem;
            }
            if(tem.next == temp){
                return temp;
            }
            tem = tem.next;
            if(tem == null){
                temp = temp.next;
                tem = headB;
            }
        } 
        return null;
    }
}