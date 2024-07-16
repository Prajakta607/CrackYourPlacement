class Solution {
    public ListNode middleNode(ListNode head) {
        //m1 two pass solution
    //     int n=0;
    //    ListNode temp=head;
    //     while(temp!=null){
    //         temp=temp.next;
    //         n++;
    //     }
    //     int middle=n/2;
    //     temp=head;
    //     for(int i=1;i<=middle;i++){
    //         temp=temp.next;
    //     }
    //     return temp;

      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;

    }
}