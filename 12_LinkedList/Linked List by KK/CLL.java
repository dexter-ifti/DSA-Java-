public class CLL {
    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }
    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        Node node = head;
        if (node == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        if (node.val == val) {
            head =  head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void display(){
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if(node.next != null){
                    node = node.next;
                }
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertFirst(23);
        list.insertFirst(96);
        list.insertFirst(84);
        list.insertFirst(17);
        list.insertFirst(45);
        list.insertFirst(76);
        list.display();
        list.delete(96);
        list.display();
    }
}
