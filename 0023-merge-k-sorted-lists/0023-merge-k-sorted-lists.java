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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
    for(ListNode list:lists){
        ListNode temp=list;
        while(temp!=null){
            minheap.offer(temp.val);
            temp=temp.next;
        }
    }
    if(minheap.isEmpty()){
        return null;
    }
    ListNode res=new ListNode(minheap.poll());
    ListNode temp=res;
    while(!minheap.isEmpty()){
        temp.next=new ListNode(minheap.poll());
        temp=temp.next;
    }
    return res;
        
    }
}