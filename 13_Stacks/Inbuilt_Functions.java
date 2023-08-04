import java.util.*;

public class Inbuilt_Functions {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(32);
        // stack.push(6);
        // stack.push(9);
        // stack.push(87);
        // stack.push(10);
        // stack.push(54);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(45);
        // queue.add(31);
        // queue.add(86);
        // queue.add(7);
        // queue.add(12);
        // queue.add(90);

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());


        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(98);
        deque.add(13);
        deque.add(64);
        deque.add(83);

        System.out.println(deque.removeLast());
        System.out.println(deque.remove());
        System.out.println(deque.remove());

    }    
}
