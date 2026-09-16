// import java.util.*;

// public class Stack {

//   static class StackB {

//     static ArrayList<Integer> list = new ArrayList<>();

//     public static boolean isEmpty() {
//       return list.size() == 0;
//     }

//     public static void push(int data) {
//       list.add(data);
//     }

//     public static int pop() {
//       if (isEmpty()) {
//         return -1;
//       }

//       int top = list.get(list.size() - 1);
//       list.remove(list.size() - 1);
//       return top;
//     }

//     public static int peek() {
//       if (isEmpty()) {
//         return -1;
//       }
//       return list.get(list.size() - 1);
//     }
//   }

//   public static void main(String[] args) {
//     StackB s = new StackB();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     while (!s.isEmpty()) {
//       System.out.println(s.peek());
//       s.pop();
//     }
//   }
// }

// import java.util.*;

// public class Stack {
//   static class StackB {
//     static ArrayList<Integer> list = new ArrayList<>();

//     public static boolean isEmpty() {
//       return list.size() == 0;
//     }

//     public static void push(int data) {
//       list.add(data);
//     }

//     public static int pop() {
//       if (isEmpty()) {
//         return -1;
//       }
//       int top = list.get(list.size() - 1);
//       list.remove(list.size() - 1);
//       return top;
//     }

//     public static int peek() {
//       if (isEmpty()) {
//         return -1;
//       }
//       return list.get(list.size() - 1);
//     }
//   }

//   public static void main(String[] args) {
// StackB s = new StackB();
// s.push(1);
// s.push(2);
// s.push(3);

// while (!s.isEmpty()) {
//   System.out.println(s.peek());
//   s.pop();
// }
//   }
// }

//Stack using Linked List
// import java.util.*;

// public class Stack {
//   static class Node {
//     int data;
//     Node next;

//     Node(int data) {
//       this.data = data;
//       this.next = null;
//     }
//   }

//   static Node head = null;

//   public static boolean isEmpty() {
//     return head == null;
//   }

//   public static void push(int data) {
//     Node newNode = new Node(data);
//     newNode.next = head;
//     head = newNode;
//   }

//   public static int pop() {
//     if (isEmpty()) {
//       return -1;
//     }

//     int top = head.data;
//     head = head.next;
//     return top;
//   }

//   public static int peek() {
//     if (isEmpty()) {
//       return -1;
//     }

//     return head.data;
//   }

//   public static void main(String[] args) {
//     Stack s = new Stack();

//     s.push(1);
//     s.push(2);
//     s.push(3);

//     while (!s.isEmpty()) {
//       System.out.println(s.peek());
//       s.pop();
//     }
//   }
// }


import java.util.Stack;
public class StackB{
  public static void main(String[] args) {
   
    //Step 1: Create Stack
    Stack<Integer> s = new Stack<>();

    //Step 2 : Push
    s.push (10);
    s.push (20);
    s.push (30);
    System.out.println(s.peek());
System.out.println(s.pop());
System.out.println(s);
System.out.println(s.search(10));
  }
}