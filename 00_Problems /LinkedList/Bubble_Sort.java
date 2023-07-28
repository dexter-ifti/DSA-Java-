public class Bubble_Sort {

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private static Node head;
    private static Node tail;

    public static void bubble(){
        bubble(6, 0);
    }

    public static void bubble(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.val > second.val) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubble(row, col + 1);
        } else {
            bubble(row - 1, 0);
        }
    }

    public static Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        Bubble_Sort list = new Bubble_Sort();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(1);
        list.insertFirst(7);
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(8);
        list.display();
        list.bubble();
        list.display();
    }
}
