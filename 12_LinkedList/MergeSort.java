// import java.util.LinkedList;
public class MergeSort {
    
    public static class Node {
        int data;
        Node next;
        
        
        Node(int data) {
            this.data = data;
            this.next = null;
           
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode ;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLLeft, newRight);
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();

        dll.addFirst(3);
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(8);
        dll.addFirst(5);
        dll.print();
        dll.head = dll.mergeSort(dll.head);
        dll.print();



        
    }
}    