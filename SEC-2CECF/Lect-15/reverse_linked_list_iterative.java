

public class reverse_linked_list_iterative {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
         ListNode later=curr.next;
         curr.next=prev;
         prev=curr;
         curr=later;
        }
        return prev;
 
     }
}
