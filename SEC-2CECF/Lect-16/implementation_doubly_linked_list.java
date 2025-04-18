import java.util.*;
class linkedlist{
    Node head;
    Node tail;
    int size;
    class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data=data;
        next=null;
        prev=null;
    }
    }
    public void addfrist(int element) {
		Node newnode = new Node(element);
		if (size == 0) {
			head = newnode;
			tail = newnode;
			size++;
		} else {
			newnode.next = head;
			head.prev=newnode;
			head = newnode;
		    size++;
		}
	}
	public void addlast(int element) {
		if (size == 0) {
			Node newnode = new Node(element);
			head = newnode;
		    tail = newnode;
			size++;
		} else {
			Node newnode = new Node(element);
		    tail.next = newnode;
		    newnode.prev=tail;
	        tail = newnode;
			size++;
		}
	}
	public void add_at_any_pos(int element, int pos)  {
		if (pos == 0) {
			addfrist(element);
		} else if (pos == size) {
			addlast(element);
		} else {
			Node newnode = new Node(element);
		    Node temp = head;
		    for (int i = 0; i<pos-1; i++) {
			 temp = temp.next;
		     }
			Node x=temp.next;
			temp.next=newnode;
			newnode.prev=temp;
			newnode.next = x;
			x.prev=newnode;
		    size++;
		}
	}
	public void removefirst()  {
		if (head == null) {
			System.out.println("no element");
		}
		Node temp = head.next;
		head = temp;
		temp.prev = null;
		size--;
	}
	public void removelast(){
		if (head == null) {
			System.out.println("no element");
		}
		if (size == 1) {
			removefirst();
		}
		Node temp = tail.prev;
		tail = temp;
		tail.next = null;
		size--;
	}
	public void remove_at_any_pos(int pos) {
		if (pos == 0) {
			   removefirst();
		} else if (pos== size - 1) {
			    removelast();
		} else {
			Node temp = head;
			for(int i=0;i<pos-1;i++){
				temp=temp.next;
			}
			Node x=temp.next.next;
			temp.next = x;
			x.prev=temp;
			size--;
		}
	}
	public void print(){
	    Node temp=head;
	    while(temp!=null){
	        System.out.print(temp.data+"->");
	        temp=temp.next;
	    }
	      System.out.println();
	}
		public void printreverse(){
	    Node temp=tail;
	    while(temp!=null){
	        System.out.print(temp.data+"<-");
	        temp=temp.prev;
	    }
	       System.out.println();
	}
	
}
public class implementation_doubly_linked_list {
    public static void main(String[] args) {
        linkedlist cecf=new linkedlist();
        cecf.addlast(10);
        cecf.addlast(20);
		cecf.addlast(40);
        cecf.addlast(50);
        cecf.addfrist(1000);
        cecf.add_at_any_pos(100,2);
        cecf.print();
        cecf.printreverse();
        cecf.removefirst();
		cecf.removelast();
		cecf.remove_at_any_pos(2);
		cecf.print();
        cecf.printreverse();
    }
}
