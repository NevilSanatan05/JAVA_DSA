//Problem 1 : Java Basics + Conditions

// public class Revision {
//   public static void main(String[] args) {
//     int arr[] = { 2, 5, 8, 11, 14, 7 };
//     int odd = 0;
//     int even = 0;
//     for (int i = 0; i < arr.length; i++) {
//       if (arr[i] % 2 == 0) {
//         even++;
//       }
//       if (arr[i] % 2 != 0) {
//         odd++;
//       }
//     }
//     System.out.println("Even numbers: " + even);
//     System.out.println("Odd numbers: " + odd);
//   }
// }

//Problem 2 : Java Loops + arrays

// public class Revision {
//   public static void main(String[] args) {
//     int arr[] = { 12, 45, 7, 89, 23, 56 };
//     int largest = Integer.MIN_VALUE;
//     for (int i = 0; i < arr.length; i++) {
//       if (arr[i] > largest) {
//         largest = arr[i];
//       }
//     }
//     System.out.println("Largest number: " + largest);

//   }
// }

//Problem 3 : Methods 

// public class Revision {
//   public static int square(int num){
//    return num*num;
//   }
//   public static void main(String[] args) {
//    int result = square(5);
//    System.out.println("Square: "+result);
//   }
// }

//Problem 4 - Arrays + Two Pointers

// public class Revision {
//   public static void main(String[] args) {
//     int arr[] = { 10, 20, 30, 40, 50 };
//     int left = 0;
//     int right = arr.length - 1;
//     while (left < right) {
//       int temp = arr[left];
//       arr[left] = arr[right];
//       arr[right] = temp;
//       left++;
//       right--;
//     }
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i]+" ");
//     }
//   }
// }

//Problem 5 - Searching

// public class Revision {
//   public static void main(String[] args) {
//     int arr[] = { 4, 9, 2, 7, 5, 1 };
//     int target = 7;
//     for (int i = 0; i < arr.length; i++) {
//      if(arr[i]==target){
//       System.out.println("Index: "+i);
//       break;
//      }
//     }
//   }
// }

//Problem 6 - Sorting

// public class Revision {
//   public static void main(String[] args) {
//     int arr[] = { 5, 2, 8, 1, 3 };
//     for (int i = 0; i < arr.length; i++) {
//       for (int j = 0; j < arr.length - 1; j++) {
//         if (arr[j] > arr[j + 1]) {
//           int temp = arr[j];
//           arr[j] = arr[j + 1];
//           arr[j + 1] = temp;

//         }
//       }
//     }
//     for (int i = 0; i < arr.length; i++) {
//       System.out.print(arr[i] + " ");
//     }
//   }
// }

//Problem 7 - Binary Search

// public class Revision {
//   public static void main(String[] args) {
//     int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
//     int target = 10;
//     int left = 0;
//     int right = arr.length-1;
//     while(left<=right){
//       int mid = (left+right)/2;
//       if(arr[mid]==target){
//         System.out.println("Index: "+mid);
//         break;
//       }
//       else if(arr[mid]<target){
//        left=mid+1;
//       }
//       else if(arr[mid]>target){
//         right=mid-1;
//       }
//     }
//   }
// }

//Problem 8 - Sliding Window

// public class Revision {
//   public static void main(String[] args) {
//     int arr[] = { 2, 1, 5, 1, 3, 2 };
//     int k = 3;
//     int window = 0;

//     //calculate the sum of the first 3 elements
//     for(int i=0;i<k;i++){
//       window=window+arr[i];
//     }
//     int maxSum = window;
//     //Slide the window
//     for(int i=k;i<arr.length;i++){
//       window=window-arr[i-k]+arr[i];
//       if(window>maxSum){
//         maxSum=window;
//       }
//     }
//       System.out.println("Maximum sum: "+maxSum);
//     }
//   }

//Problem 9 - Prefix Sum / Subarray Sum

// public class Revision {
//   public static void main(String[] args) {
//     int arr[] = { 2, 4, 1, 3, 5 };
//     int sum = 0;
//     int left = 1;
//     int right = 3;
//     for (int i = left; i <= right; i++) {
//       sum = sum + arr[i];
//     }
//     System.out.println(sum);
//   }
// }

//Problem 10 - Second Largest Distinct Number 

// public class Revision {
//   public static void main(String[] args) {
//    int arr[] = {10, 5, 20, 8, 15};
//    int largest = arr[0];
//    int secondLargest = Integer.MIN_VALUE;
//    for(int i=0;i<arr.length;i++){
//     if(arr[i]>largest){
//       secondLargest=largest;
//       largest=arr[i];
//     }
//     else if(largest>arr[i] && arr[i]>secondLargest){
//       secondLargest=arr[i];
//     }

//    }
//    System.out.println("Largest: "+largest);
//    System.out.println("secondLargest: "+secondLargest);
//   }
// }

//Problem 11 - Palindrome 

// public class Revision{
//   public static void main(String[] args) {
//     String word = "madam";
//     int left =0;
//     int right = word.length()-1;
//     boolean isPalindrome = true;
//     while(left<right){
//       if(word.charAt(left)!=word.charAt(right)){
//         isPalindrome=false;
//         break;
//       }
//       left++;
//       right--;
//     }
//     if(isPalindrome){
//       System.out.println("Is a Palindrome");
//     }
//     else{
//       System.out.println("Is not a Palindrome");
//     }
//   }
// }

//Problem 12 - Counting Vowels

// public class Revision{
//   public static void main(String[] args) {
//    String word = "education";
//    int count = 0;
//    for(int i=0;i<word.length();i++){
//     if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
//       count++;
//     }
//    }
//    System.out.println("Vowels = "+count);
//   }
// }

//Problem 13 - Reverse a String

// public class Revision {
//   public static void main(String[] args) {
//     String word = "hello";
//     for (int i = word.length() - 1; i >= 0; i--) {
//       System.out.print(word.charAt(i) + " ");
//     }
//   }
// }

//Problem 14 - Character Frequence (Hashing)
import java.util.*;

public class Revision {
  public static void main(String[] args) {
    HashMap<Character, Integer> map = new HashMap<>();
    String word = "banana";
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    System.out.println(map);
  }
}