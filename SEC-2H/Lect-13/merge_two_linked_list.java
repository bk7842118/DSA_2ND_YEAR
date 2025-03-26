

public class merge_two_linked_list {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode (-1);
        ListNode temp=dummy;
        while (l1!=null && l2!=null) {
            if (l1.val < l2.val) {
                dummy.next=l1;
                dummy=dummy.next;
                l1=l1.next;
            }
            else {
                dummy.next=l2;
                l2=l2.next;
                dummy=dummy.next;
            }
        }

        if (l1!=null) {
            dummy.next=l1;
        }

        if (l2!=null) {
              dummy.next=l2;
        }
        return temp.next;
    }
  
}
