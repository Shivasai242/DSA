import java.util.Collections;
import java.util.PriorityQueue;


public class objects {
    static class Student implements Comparable<Student> {  //overriding
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this .rank - s2.rank;
        }
    }
    public static void main(String[] args){
        //1, 2, 3, 4, 5
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(3);  //O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());  //O(1)
            pq.remove();  //O(logn)
        }

        
    }
    
}
