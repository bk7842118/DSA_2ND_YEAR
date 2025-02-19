
public class detect_cycle_first_approach {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode>s=new HashSet<>();
        while(head!=null){
            if(s.contains(head)==true)return true;
            s.add(head);
            head=head.next;
        }
        return false;
    }
}
