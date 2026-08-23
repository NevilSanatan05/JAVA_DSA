public class LinkedList {
  public class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // Methods -> add(), remove(), print(), search()

  public static Node head;
  public static Node tail;

  public void addFirst(int data) {

    if (head == null) {
      head = tail = new Node(data);
      return;
    }

    // step1 = create new node
    Node newNode = new Node(data);

    // step2 - newNode next = head
    newNode.next = head; // Link

    // step3 - head = newNode
    head = newNode;
  }

  public void addLast(int data) {
    if (head == null) {
      head = tail = new Node(data);
      return;
    }
    Node newNode = new Node(data);
    tail.next = newNode;
    tail = newNode;
  }

  public void print(){
    if(head==null){
      System.out.println("LL is empty");
      return;
    }
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public static void main(String args[]) {
    LinkedList ll = new LinkedList();
    ll.print();
     ll.addFirst(2);
    ll.print();
    ll.addFirst(1);
    ll.print();
    ll.addLast(3);
    ll.print();
    ll.addLast(4);
    ll.print();

  }
}