class Solution {
    public int lengthNode(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        ListNode prev=null;
        int len=lengthNode(head);
        int front=len-n+1;
        int i=1;
        if(n==1 && len==1) return null;
        while(i!=front && curr!=null){
            prev=curr;
            curr=curr.next;
            i++;
        }
        if(front==1) return head.next;
        if(prev!=null)
        prev.next=curr.next;
        return head;
    }
}