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
    public int count(ListNode head){
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=count(headA);
        int c2=count(headB);
        ListNode tempA=headA;
        ListNode tempB=headB;
        int diff=Math.abs(c1-c2);
        if(c1>c2){
            while(diff-->0){
                tempA=tempA.next;
            }
        }
        else if(c2>c1){
            while(diff-->0){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
            if(tempA==null || tempB==null){
                return null;
            }
        }
        return tempA;
    }
}