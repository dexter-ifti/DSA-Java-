public Node reverseKGroup(Node head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }
        Node current = head;
        Node prev = null;

        while (true) {
            Node last = prev;
            Node newEnd = current;

            Node next = current.next;
            for (int i = 0; i < k && current != null; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;
            if (current == null) {
                break;
            }
            prev = newEnd;
        }
        return head;
    }


    public Node reverseAlternateKGroup(Node head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node last = prev;
            Node newEnd = current;

            Node next = current.next;
            for (int i = 0; i < k && current != null; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;
            // skip k nodes
            for (int i = 0; i < k && current != null; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
