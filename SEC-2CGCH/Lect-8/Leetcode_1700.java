import java.util.*;

public class Leetcode_1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student = new LinkedList<>();
        Queue<Integer> sandwich = new LinkedList<>();
        for(int i=0;i<students.length;i++){
            student.add(students[i]);
        }
        for(int i=0;i<sandwiches.length;i++){
            sandwich.add(sandwiches[i]);
        }
        int counter=0;
        while(!student.isEmpty()&& counter<student.size()){
            
            int topstud = student.poll();
            if(topstud==sandwich.peek()){
                sandwich.poll();
                counter=0;
            }
            else{
                counter++;
                student.add(topstud);
            }
        }
        return student.size();
    }
}

