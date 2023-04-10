import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueIntro {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.add(3);pq.add(4);  pq.add(1); pq.add(2); pq.add(6);
        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+"\t");
            pq.remove();
        }
        
        System.out.println();
        
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        
        pq1.add(3); pq1.add(4);pq1.add(1); pq1.add(2);pq1.add(6);
        while(!pq1.isEmpty()){
            System.out.print(pq1.peek()+"\t");
            pq1.remove();
        }    
    }
}
