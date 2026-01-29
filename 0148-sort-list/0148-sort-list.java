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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        ListNode curr=head;
        while(curr!=null){
            heap.add(curr.val);
            curr=curr.next;
        }
        curr=head;
        while(!heap.isEmpty()){
            curr.val=heap.poll();
            curr=curr.next;
        }
        return head;

    }
}