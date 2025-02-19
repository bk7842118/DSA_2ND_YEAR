

public class intersection_of_two_linked_list_first {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1= headA;
        ListNode temp2= headB;
          while(temp1!=temp2){
            if(temp1==null){
                temp1=headB;
            }else{
                 temp1=temp1.next;
            }
            if(temp2==null){
                temp2=headA;
            }else{
            
            temp2=temp2.next;
            }
          }
          return temp1;
        } 
}
