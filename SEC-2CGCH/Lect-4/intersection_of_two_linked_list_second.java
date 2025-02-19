

public class intersection_of_two_linked_list_second {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode>st=new HashSet<>();
       while(headA!=null){
           st.add(headA);
           headA=headA.next;
       }
       while(headB!=null){
           if(st.contains(headB)==true)return headB;
           headB=headB.next;
       }
       return null;
   }  
}
