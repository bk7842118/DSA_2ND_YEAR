public class add_two_number {
  public static void main(String[] args) {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
       ListNode dummy=new ListNode(-1);
       ListNode temp=dummy;
       while(l1!=null || l2!=null || carry!=0){
           int s=carry;
           if(l1!=null){
              s=s+l1.val;
              l1=l1.next;
           }
           if(l2!=null){
               s=s+l2.val;
               l2=l2.next;
           }
           carry=s/10;
           ListNode n=new ListNode(s%10);
           dummy.next=n;
           dummy=dummy.next;    
       }
     
       return temp.next; 
   }
}  
}  

