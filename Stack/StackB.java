// import java.util.*;

// public class StackB{

//   public static class Stack {
//     static ArrayList<Integer> list = new ArrayList<>();

//     public static boolean isEmpty() {
//       return list.size() == 0;
//     }

//     // push
//     public static void push(int data) {
//       list.add(data);
//     }

//     // pop
//     public static int pop() {
//       if(isEmpty()){
//         return -1;
//       }
//       int top = list.get(list.size() - 1);
//       list.remove(list.size() - 1);
//       return top;
//     }

//     // peek
//     public static int peek() {
//       if(isEmpty()){
//         return -1;
//       }
//       return list.get(list.size() - 1);
//     }
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


// import java.util.*;

// public class StackB {

//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Stack {
//         static Node head = null;

//         // isEmpty
//         static boolean isEmpty() {
//             return head == null;
//         }

//         // push
//         public void push(int data) {
//             Node newNode = new Node(data);

//             if (isEmpty()) {
//                 head = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         // pop
//         public int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             int top = head.data;
//             head = head.next;

//             return top;
//         }

//         // peek
//         public int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             return head.data;
//         }
//     }

//     public static void main(String[] args) {

//         Stack s = new Stack();

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// import java.util.*;

// public class StackB {

//         public static void main(String[] args) {

//        // Stack s = new Stack();

//        Stack<Integer> s = new Stack<>();

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


//Push at bottom
// import java.util.*;
// public class StackB{
//   public static void pushAtBottom(Stack<Integer> s,int data){
//     if(s.isEmpty()){
//       s.push(data);
//       return;
//     }
// int top = s.pop();
// pushAtBottom(s,data);
// s.push(top);
//   }
//   public static void main(String[] args) {
//     Stack<Integer> s = new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     pushAtBottom(s,4);
//     while (!s.empty()) {
//       System.out.println(s.pop());
//     }
//   }

// }


//reverse string using a stack
// import java.util.*;
// public class StackB{

//   public static String reverseString(String str){
//     Stack<Character> s = new Stack<>();
//     int idx = 0;
//     while(idx<str.length()){
//       s.push(str.charAt(idx));
//       idx++;
//     }
//     StringBuilder result = new StringBuilder("");
//     while(!s.isEmpty()){
//       char curr = s.pop();
//       result.append(curr);
//     }
//     return result.toString();
//   }
//   public static void main(String[] args) {
//     String str = "Helloworld";
//     String result = reverseString(str);
//     System.out.println(result);
//   }
// }


