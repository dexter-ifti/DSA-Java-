import java.util.Stack;

public class Queue_using_Stacks {
    private Stack<Integer> first ;    
    private Stack<Integer> second;

    public Queue_using_Stacks(){
        first = new Stack<>();
        second = new Stack<>();
    }

    // push function --> O(1) 
    public void push(int item){
        first.push(item);
    }

    // pop function --> O(N)
    public int pop() throws Exception{
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    // peek Function --> O(N)
    public int peek() throws Exception{
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    // add(push) function --> O(N);
    public void add(int item) throws Exception{
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(item);

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }
    // remove(pop) function --> O(1)
    public int remove(){
        return first.pop();
    }
    
    // front(Peek) function --> O(1)
    public int front(){
        return first.peek();
    }
    public static void main(String[] args) throws Exception {
        Queue_using_Stacks queue = new Queue_using_Stacks();
        queue.push(23);
        queue.push(99);
        queue.push(61);
        queue.push(28);
        queue.push(43);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
