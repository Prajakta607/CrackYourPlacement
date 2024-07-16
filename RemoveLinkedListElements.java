public ListNode removeElements(ListNode head, int val) {
        if(head==null)return null;
        ListNode dummy = new  ListNode(-1);
        dummy.next=head;
        ListNode A=dummy;
        ListNode B=head;
        while(B!=null){
            while( B!=null && B.val!=val){
                A=B;
                B=B.next;
            }
            if(B==null)break;
            A.next=B.next;
            B=B.next;
        }
        return dummy.next;

    }
