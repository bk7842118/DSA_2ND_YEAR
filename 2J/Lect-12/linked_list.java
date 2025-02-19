
import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
public class linked_list {
    public static void main(String[] args) {
        Node a1=new Node(10);
        Node a2=new Node(20);
        Node a3=new Node(30);
        Node a4=new Node(40);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        Node temp=a1;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}

