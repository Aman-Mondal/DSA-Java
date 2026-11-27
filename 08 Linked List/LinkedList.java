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
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
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
        while (temp != null) {
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
        if (head == null) {
            System.out.println("Empty LL");
            return -1;
        }
        if (head.next == null) {
            int data = head.data;
            head = tail = head.next;
            return data;
        }
        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Invalid position!");
        } else if (curr.next == null) {
            removeEnd();
        }
        int val = curr.next.data;
        curr.next = curr.next.next;
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
        while (curr.next != tail) {
            curr = curr.next;
        }
        tail = curr;
        tail.next = null;
        return val;
    }

    // Iterative
    public boolean searchItr(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean searchRec(Node head, int key) {
        if (head == null) {
            return false;
        }
        if (head.data == key) {
            return true;
        }
        return searchRec(head.next, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthFromEnd(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size += 1;
            temp = temp.next;
        }
        System.out.println(size);
        if (n == size) { // First Element to be removed
            head = head.next;
            return;
        }
        int iReq = size - n;
        Node curr = head;
        for (int i = 0; i < iReq - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        printLL();
    }

    // Check if Palindrome

    // Finding Mid of a LL
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = findMid(head);
        Node prev = null;
        Node curr = mid;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rtHalf = prev;
        Node ltHalf = head;
        while (rtHalf != null) {
            if (ltHalf.data != rtHalf.data) {
                return false;
            }
            rtHalf = rtHalf.next;
            ltHalf = ltHalf.next;
        }
        return true;
    }

    // Loop Detetion in LL
    // Floyd's Cucle finding algo
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Remove Cycle
    public void removeCycle() {
        boolean cycle = false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
            }
        }
        if (cycle == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
    }

    // zig zag LL
    public void zigzag() {
        Node mid = null;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        mid = slow;
        Node next = null;
        Node prev = null;
        while(slow!=null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        // prev is node of right 
        // head is head
        Node left = head;
        Node right = prev;
        Node nextLt, nextRt;

        while(left!=null && right!=null) {
            nextLt = left.next;
            left.next = right;
            nextRt = right.next;
            right.next = nextLt;
            left = nextLt;
            right = nextRt;
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addStart(4);
        ll.addStart(3);
        ll.addStart(7);
        ll.addEnd(14);
        ll.addMid(12, 1);

        ll.addEnd(4);
        ll.addEnd(3);
        ll.addEnd(12);
        ll.addEnd(7);
        ll.printLL();
        // System.out.println(ll.checkPalindrome());
        // ll.removeStart();
        // ll.printLL();
        // ll.removeEnd();
        // ll.printLL();
        // ll.removeMid(2);
        // ll.printLL();
        // System.out.println(ll.searchRec(head, 7));
        // ll.reverse();
        // ll.printLL();
        // ll.removeNthFromEnd(3);
        ll.zigzag();
        ll.printLL();
    }
}
