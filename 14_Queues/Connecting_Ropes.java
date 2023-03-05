import java.util.*;

public class Connecting_Ropes {

    // Function to calculate the minimum cost to join `n` ropes into a single rope
    static int findMinCost(List<Integer> prices) {
        // create a min-heap using `PriorityQueue` class from elements of the list
        PriorityQueue<Integer> pq = new PriorityQueue<>(prices);

        // keep track of the minimum cost so far
        int cost = 0;

        // repeat till heap size is reduced to one
        while (pq.size() > 1) {

            // Extract the top two elements from the min-heap
            int x = pq.poll();
            int y = pq.poll();

            // calculate the cost of the extracted values
            int sum = x + y;

            // insert the cost back to the min-heap
            pq.add(sum);

            // update the minimum cost
            cost += sum;
        }

        return cost;
    }

    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(4, 2, 3, 6);
        System.out.println("The minimum cost is " +findMinCost(prices));
    }
}
