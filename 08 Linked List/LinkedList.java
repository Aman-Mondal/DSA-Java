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
        if(head==null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addMid(int data, int pos) {
        Node newNode = new Node(data);
        if(head==null) {
            addStart(data);
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++) {
            temp=temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printLL() {
        if(head==null) {
            System.out.println("Empty LL");
        }
        Node temp = head;
        while(head!=tail && temp!=null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void addEnd(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addStart(4);
        ll.addStart(3);
        ll.addStart(7);
        ll.addEnd(14);
        ll.addMid(12, 1);
        ll.printLL();
    }    
}
