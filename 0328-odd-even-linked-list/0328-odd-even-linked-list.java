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
    public int length(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode oddEvenList(ListNode head) {
        int len=length(head);
        ListNode curr=head;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(i%2==0){
                list.add(curr.val);
            }
            else list2.add(curr.val);
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<list.size();i++){
            curr.val=list.get(i);
            curr=curr.next;
        }
        for(int i=0;i<list2.size();i++){
            curr.val=list2.get(i);
            curr=curr.next;
        }
        return head;
    }
}