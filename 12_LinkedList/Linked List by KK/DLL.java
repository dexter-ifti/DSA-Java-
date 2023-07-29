public class DLL {

    private Node head;

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        // public Node(int val, Node next, Node prev){
        //     this.val = val;
        //     this.next = next;
        //     this.prev = prev;
        // }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public Node find(int val){
        Node node = head;
        while(node != null){
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public void insert(int after, int val){
        Node p = find(after);
        
        if (p == null) {
            System.out.println("Doesn't exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;

        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.val + " <-> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("Null");

        System.out.println("Print in Reverse :");
        while (last != null) {
            System.out.print(last.val + " <-> ");
            last = last.prev; 
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(4);
        list.insertFirst(39);
        list.insertFirst(1);
        list.insertFirst(8);
        list.insertFirst(2);
        list.insertLast(50);
        list.insert(39, 0);
        list.display();
    }
}
