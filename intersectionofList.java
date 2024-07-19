public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // ListNode tempA = headA;
        // ListNode tempB = headB;
        // int lengthA = 0;
        // while(tempA!=null){
        //     lengthA++;
        //     tempA=tempA.next;
        // }
        // int lengthB = 0;
        // while(tempB!=null){
        //     lengthB++;
        //     tempB=tempB.next;
        // }
        // tempA=headA;
        // tempB=headB;
        // if(lengthA>lengthB){
        //     int steps=lengthA-lengthB;
        //     for(int i=1;i<=steps;i++){
        //         tempA=tempA.next;
        //     }
        // }
        // else{
        //     int steps=lengthB-lengthA;
        //     for(int i=1;i<=steps;i++){
        //         tempB = tempB.next;
        //     }
        // }
        // above make both list of equal length so now if we tarverse list 
        // if list are not intersecting then both tempAand tempB are reach to null
        // simultaneously  and both become null that is equal so null is returned if no intersecting
        // while(tempA!=tempB){
        //     tempA = tempA.next;
        //     tempB = tempB.next;
        // }
        // return tempA;

        //M2
        int na=0,nb=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            tempA=tempA.next;
            na++;
        }
        while(tempB!=null){
            tempB=tempB.next;
            nb++;
        }
        tempA =headA;
        tempB =headB;
        if(na>nb){
            for(int i=0;i<na-nb;i++){
                tempA=tempA.next;
            }
            while(tempA!= null && tempB!=null){
                if(tempA==tempB)return tempA;
                tempA=tempA.next;
                tempB=tempB.next;
            }
            return null;
        }
        else{
              for(int i=0;i<nb-na;i++){
                tempB=tempB.next;
            }
            while(tempA!= null && tempB!=null){
                if(tempA==tempB)return tempB;
                tempA=tempA.next;
                tempB=tempB.next;
            }
            return null;
        }

        
    }
}