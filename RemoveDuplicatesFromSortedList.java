class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
       ListNode  A=head;
       ListNode  B=A.next;
        while(B!=null){
            while( B!=null && A.val==B.val){
                B=B.next;
            }
            A.next=B;
            A=B;
            if(A==null)break;
            else  B=A.next;
        }
        return head;
    }
}