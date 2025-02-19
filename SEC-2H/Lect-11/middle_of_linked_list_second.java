

public class middle_of_linked_list_second {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
         ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
       
    }
   
}
