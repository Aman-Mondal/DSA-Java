public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addMid(int data, int pos) {
        Node newNode = new Node(data);
        if (head == null) {
            addStart(data);
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp!=null; i++) {
            temp = temp.next;
        }
        if(temp==null) {
            System.out.println("Invalid Position!");
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("Empty LL");
        }
        Node temp = head;
        while (head != tail && temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int removeStart() {
        if (head == null) {
            System.out.println("Empty LL!");
            return -1;
        }
        if (head.next == null) {
            int data = head.data;
            head = tail = head.next;
            return data;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int removeMid(int pos) {
        if(head == null) {
            System.out.println("Empty LL");
            return -1;
        }
        if(head.next==null) {
            int data = head.data;
            head = tail = head.next;
            return data;
        }
        Node curr = head;
        for(int i=1;i<pos-1 && curr!=null;i++) {
            curr = curr.next;
        }
        if(curr==null) {
            System.out.println("Invalid position!");
        } else if (curr.next==null) {
            removeEnd();
        }
        int val = curr.next.data;
        curr.next=curr.next.next;
        return val;
    }

    public int removeEnd() {
        if (head == null) {
            System.out.println("Empty LL!");
            return -1;
        }
        if (head.next == null) {
            int data = head.data;
            head = tail = head.next;
            return data;
        }
        int val = tail.data;
        Node curr = head;
        while(curr.next!=tail) {
            curr = curr.next;
        }
        tail = curr;
        tail.next = null;
        return val;
    }

    // Iterative
    public boolean searchItr(int key) {
        Node temp = head;
        while(temp!=null) {
            if(temp.data==key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addStart(4);
        ll.addStart(3);
        ll.addStart(7);
        ll.addEnd(14);
        ll.addMid(12, 1);
        // ll.printLL();
        // ll.removeStart();
        // ll.printLL();
        // ll.removeEnd();
        // ll.printLL();
        // ll.removeMid(2);
        ll.printLL();
        System.out.println(ll.searchItr(8));
    }
}
