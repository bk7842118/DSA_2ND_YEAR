import java.util.*;
class queue{
    int[] arr;
    int size=0;
    int front=0;
    int rear=-1;

    queue(){
        arr=new int[5];
    }

    queue(int n){
        arr=new int[n];
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        if (size==0) return true;
        return false;
    }

    boolean isfull(){
        if (size==arr.length) return true;
        return false;
    }

    void add(int val){
        if(isfull()){
            System.out.println("queue is full..");
            return;
        }

        rear=(rear+1)%arr.length;
        arr[rear]=val;
        size++;
    }

    int remove(){
        if(isEmpty()){
            System.out.println("queue is empty..");
            return -1;
        }

        int x=arr[front];
        size--;
        front=(front+1)%arr.length;
        return x;
    }

    int front(){
        if(isEmpty()){
            System.out.println("queue is empty..");
            return -1;
        }

        return arr[front];
    }

    void print(){
        for (int i=0;i<size;i++){
            System.out.print(arr[(i+front)%arr.length]+" ");
        }
        System.out.println();
    }
}
public class Implementation_of_queue {
public static void main(String[] args) {
    queue q=new queue();
    System.out.println(q.isEmpty()); // true
    q.add(5);
    q.add(10);
    q.add(15);
    q.add(20);
    System.out.println(q.size()); // 4

    q.print(); // 5 10 15 20
    System.out.println(q.front()); // 5
    q.remove();
    q.print(); // 10 15 20

    System.out.println(q.isEmpty()); // false
    System.out.println(q.front()); // 10

    q.add(100);
    q.remove();
    q.add(120);

    q.print();// 15 20 100 120
}
}

