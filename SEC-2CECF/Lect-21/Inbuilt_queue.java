import java.util.*;

public class Inbuilt_queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        System.out.println(q.isEmpty()); // true
        q.add(5);
        q.add(10);
        q.offer(15);
        q.offer(20);
        System.out.println(q.size()); // 4

        System.out.println(q);// 5 10 15 20
        
        q.poll();

        System.out.println(q.peek());// 10

        System.out.println(q); // 10 15 20

        System.out.println(q.isEmpty()); // false

        q.add(100);

        q.remove();
        q.add(120);

        System.out.println(q);// 15 20 100 120
    }
}

