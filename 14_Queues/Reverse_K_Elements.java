import java.util.*;

public class Reverse_K_Elements {
    static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        solve(q, k);
        int s = q.size() - k;
        while (s-- > 0) {
            int x = q.poll();
            q.add(x);
        }
        return q;
    }

    static void solve(Queue<Integer> q, int k) {
        if (k == 0) {
            return;
        }
        int e = q.poll();
        solve(q, k - 1);
        q.add(e);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        queue.add(110);
        queue.add(120);
        queue.add(130);
        queue.add(140);
        queue.add(150);

        int k = 5;
        queue = reverseFirstK(queue, k);
        // printing queue
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }
}

// Meethod 2
class Reverse_k_element_queue {
 
 static Queue<Integer> queue;
 static void reverseQueueFirstKElements(int k)
  {
    if (queue.isEmpty() == true
      || k > queue.size())
      return;
    if (k <= 0)
      return;
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < k; i++) {
      stack.push(queue.peek());
      queue.remove();
    }
    while (!stack.empty()) {
      queue.add(stack.peek());
      stack.pop();
    }
    for (int i = 0; i < queue.size() - k; i++) {
      queue.add(queue.peek());
      queue.remove();
    }
  }
  static void Print()
  {
    while (!queue.isEmpty()) {
      System.out.print(queue.peek() + " ");
      queue.remove();
    }
  }
  public static void main(String args[])
  {
    queue = new LinkedList<Integer>();
    queue.add(5);
    queue.add(10);
    queue.add(15);
    queue.add(20);
    queue.add(25);
    
    int k = 3;
    reverseQueueFirstKElements(k);
    Print();
  }
}
