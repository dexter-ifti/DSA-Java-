// import java.util.LinkedList;
public class ZigZag {
    
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
    
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode ;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

   public void zigZag()
   {
    // find mid
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;

    // reverse second half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next ;

    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    Node left = head;
    Node right = prev;
    Node nextL, nextR; 

    // alt merge --- zigzag merge

    while (left != null && right != null) {
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;

        left = nextL;
        right = nextR;
    }
   }


    public static void main(String[] args) {
        LL ll = new LL();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.print();
        // ll.head = ll.mergeSort(ll.head);
        ll.zigZag();
        ll.print();
        
    }
}    