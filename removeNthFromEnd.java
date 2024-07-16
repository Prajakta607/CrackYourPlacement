class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //     // m1 two pass soln
    //     if(head==null)return null;
    //     int N=0;
    //    ListNode temp=head;
    //     while(temp!=null){
    //         temp=temp.next;
    //         N++;
    //     }
    //     int ridx=N-n;
    //     if(ridx==0)return head.next;
    //     temp=head;
    //     for(int i=1;i<ridx;i++){
    //         temp=temp.next;
    //     }
    //     temp.next=temp.next.next;
    //    return head;
    
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null)return slow.next;
        while( fast.next!=null){   
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}