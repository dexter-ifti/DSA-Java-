// import java.util.LinkedList;

public class LL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
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

    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node temp = head;
        int i = 0 ;
        while (temp != null) {
            if (i == idx-1) {  //add here
                Node newNode = new Node(data);
                // insertion at middle
                newNode.next = newNode;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            i++;
        }

    }
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size -- ;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = idx -2       
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
      public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key) {
       return helper(head, key);
    }

    public static void main(String[] args) {
        LL ll = new LL();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }

}
