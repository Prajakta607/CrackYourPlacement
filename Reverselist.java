class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode prev=null;
        ListNode curr=head;
        ListNode agla=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=agla;
            if(curr==null)break;
            agla=curr.next;
        }
        return prev;
    }
}