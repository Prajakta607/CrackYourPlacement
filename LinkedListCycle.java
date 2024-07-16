public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            if(fast.next==null)return false;
            if(fast.next==slow)return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}