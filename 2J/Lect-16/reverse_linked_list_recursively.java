
public class reverse_linked_list_recursively {
    public ListNode reverseList(ListNode head) {
        // base case
        if(head==null ||head.next==null){
            return head;
        }
        // smaller problem
        ListNode  ans=reverseList(head.next);
        // small calculation
        ListNode x=head.next;
        x.next=head;
        head.next=null;
        return ans;
        

    }
}
