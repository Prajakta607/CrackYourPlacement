class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy= new ListNode(0);
        ListNode tempc= dummy;
        ListNode tempA=list1;
        ListNode tempB=list2;
        while(tempA!=null && tempB!=null){
            if(tempA.val>tempB.val){
                tempc.next=tempB;
                tempc=tempc.next;
                tempB=tempB.next;
            }
            else{
                tempc.next=tempA;
                tempc=tempc.next;
                tempA=tempA.next;
            }
        } 
        if(tempA!=null){
            tempc.next=tempA;
        }
        else{
            tempc.next=tempB;
        }
        return dummy.next;
    }
}
