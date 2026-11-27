public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printDll() {
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data+" <-> ");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public int removeFirst() {
        if(head == null) {
            return Integer.MIN_VALUE;
        }
        if(head.next==null) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head.next.prev = null;
        head = head.next;
        return val;
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(12);
        dll.addFirst(41);
        dll.addFirst(11);
        dll.addFirst(10);
        dll.addFirst(21);
        dll.addFirst(34);
        dll.printDll();
        dll.reverse();
        System.out.println();
        dll.printDll();
    }
}
