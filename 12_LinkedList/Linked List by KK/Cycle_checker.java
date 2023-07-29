public class Cycle_checker {
    private static class Node{
        int val;
        Node next;

        public Node (int val){
            this.val = val;
            this.next = null;
        }
    }

    private static Node head;
    // private static Node tail;
    private static int size;

    public static boolean hasCycle(){
        Node slow = head;
        Node fast = head;

        while(fast.next != null || fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static int length(){
        Node node = head;
        if (head == null) {
            return 0;
        }
        do {
            size++;
            node = node.next;
        } while (node != head || node != null);
        return size;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(9);
        head.next.next.next = new Node(2);
        // head.next.next.next.next = head;
        head.next.next.next.next = new Node(10);
        System.out.println(length());
    }
}
