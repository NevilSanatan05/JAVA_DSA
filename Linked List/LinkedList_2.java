public class LinkedList_2 {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;
    static int size;

    // ================= ADD FIRST =================

    public void addFirst(int data) {

        // Step 1: Create new node
        Node newNode = new Node(data);
        size++;

        // If Linked List is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: New node points to current head
        newNode.next = head;

        // Step 3: Make new node the head
        head = newNode;
    }

    // ================= ADD LAST =================

    public void addLast(int data) {

        // Step 1: Create new node
        Node newNode = new Node(data);
        size++;

        // If Linked List is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: Current tail points to new node
        tail.next = newNode;

        // Step 3: Make new node the tail
        tail = newNode;
    }

    // ================= PRINT =================

    public void print() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // ================= CYCLE DETECTION =================

    public static boolean isCycle() {

        // Floyd's Cycle Detection Algorithm

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

    // ================= REMOVE CYCLE =================

    public static void removeCycle() {

        // Step 1: Detect cycle

        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // No cycle
        if (!cycle) {
            return;
        }

        // Step 2: Find starting point of cycle

        slow = head;
        Node prev = null;

        while (slow != fast) {

            prev = fast;

            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove cycle

        prev.next = null;
    }

    // ================= GET MID =================

    private Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // ================= MERGE =================

    private Node merge(Node head1, Node head2) {

        // Dummy node
        Node mergedLL = new Node(-1);

        Node temp = mergedLL;

        // Compare both lists
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

        // If elements are remaining in head1
        while (head1 != null) {

            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        // If elements are remaining in head2
        while (head2 != null) {

            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    // ================= MERGE SORT =================

    public Node mergeSort(Node head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Find middle
        Node mid = getMid(head);

        // Step 2: Divide into two lists
        Node rightHead = mid.next;

        mid.next = null;

        // Step 3: Sort left half
        Node newLeft = mergeSort(head);

        // Step 4: Sort right half
        Node newRight = mergeSort(rightHead);

        // Step 5: Merge both sorted halves
        return merge(newLeft, newRight);
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        LinkedList_2 ll = new LinkedList_2();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println("Before Merge Sort:");
        ll.print();

        ll.head = ll.mergeSort(ll.head);

        System.out.println("After Merge Sort:");
        ll.print();
    }
}