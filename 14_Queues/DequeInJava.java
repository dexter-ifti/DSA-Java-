import java.util.*;

// Deque And Dequeue , both are different
// Deque ---> Interface in java
// Dequeue ---> Remove Method
public class DequeInJava {
   
    public static void main(String[] args) {
       Deque<Integer> q = new LinkedList<>();
       q.addFirst(1);
       q.addFirst(2);
       q.addLast(3);
       q.addLast(4);
       System.out.println(q);
       q.removeFirst();
       System.out.println(q);
       q.removeLast();
       System.out.println(q);

       System.out.println("First Element = " + q.getFirst());
       System.out.println("last Element = " + q.getLast());

    }
}
