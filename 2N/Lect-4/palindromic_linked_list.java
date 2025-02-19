

public class palindromic_linked_list {
    public static ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    } 
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; 
        }
        ListNode middle=middle(head);
     
        ListNode rev = reverse(middle);
        ListNode first=head;  
        
        while (rev != null) {
            if (first.val != rev.val) {
                return false; 
            }
            first = first.next;
            rev=rev.next;
        }

        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev; 
    } 
}
