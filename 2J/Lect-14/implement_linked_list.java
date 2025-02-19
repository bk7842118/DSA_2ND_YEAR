import java.util.*;
class linkedlist{
    Node head;
    Node tail;
    int size;
    class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
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
			newnode.next = x;
		    size++;
		}
	}
	public void removefirst()  {
		if (head == null) {
			System.out.println("no element");
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		size--;
	}
	public void removelast(){
		if (head == null) {
			System.out.println("no element");
		}
		if (size == 1) {
			removefirst();
		}
		Node temp = head;
		for(int i=0;i<size-2;i++){
            temp=temp.next;
		}
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
			temp.next = temp.next.next;
			size--;
		}
	}
	public void print(){
	    Node temp=head;
	    while(temp!=null){
	        System.out.print(temp.data+"->");
	        temp=temp.next;
	    }
	}
	
}
public class implement_linked_list {
    public static void main(String[] args) {
       linkedlist j=new linkedlist();
        j.addlast(10);
        j.addlast(20);
		j.addlast(40);
        j.addlast(50);
        j.addfrist(1000);
        j.add_at_any_pos(100,2);
        j.print();
		j.removefirst();
		j.removelast();
		j.remove_at_any_pos(2);
		j.print();
    }
}
