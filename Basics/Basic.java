//Day1
// //Java is case - sensitive
// import java.util.Scanner;

// public class Basic {
//   public static void main(String[] args) {
//     // System.out.println("Hello");
//     // System.out.println("My name is Nevil");
//     // System.out.println("I am Learning Java");
//     // String name = "Nevil";
//     // int age = 20;
//     // double height = 5.8;
//     // boolean student = true;

//     // System.out.println("Name: " + name);
//     // System.out.println("Age: " + age);
//     // System.out.println("Height: " + height);
//     // System.out.println("Student: " + student);
//     Scanner sc = new Scanner(System.in);
//     // System.out.print("Enter your name : ");
//     // String name = sc.nextLine();
//     // System.out.print("Enter your age : ");
//     // int age = sc.nextInt();
//     // System.out.print("Enter your height : ");
//     // double height = sc.nextDouble();
//     // System.out.println("Name: " + name);
//     // System.out.println("Age: " + age);
//     // System.out.println("Height: " + height);
//     // System.out.print("Enter first number: ");
//     // int a = sc.nextInt();
//     // System.out.print("Enter second number: ");
//     // int b = sc.nextInt();

//     // System.out.println("Sum:" + (a + b));
//     // System.out.println("Difference:" + (a - b));
//     // System.out.println("Multiplication:" + (a * b));
//     // System.out.println("Division:" + (a /b));
//     // System.out.println("Remainder:" + (a%b));
//     System.out.print("Enter your name: ");
//     String name = sc.next();
//     System.out.print("Enter your age: ");
//     int age = sc.nextInt();
//     System.out.print("Enter yout birth year: ");
//     int year = sc.nextInt();
// System.out.println("Name: "+name);
// System.out.println("Age in 2026: "+ (2026-year));

//     sc.close();
//   }
// }

import java.util.Scanner;

public class Basic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter first number: ");
    // int a = sc.nextInt();

    // System.out.print("Enter second number: ");
    // int b = sc.nextInt();
    // System.out.println("Greater: "+ (a>b));
    // System.out.println("Smaller: "+ (a<b));
    // System.out.println("Equa;: "+ (a==b));
    // System.out.println("Different: "+ (a!=b));

    // System.out.print("Enter number: ");
    // int a = sc.nextInt();
    // if(a%2==0){
    //   System.out.println("Even number");
    // }
    // else{
    //   System.out.println("Odd number");
    // }
// if(a>b){
//   System.out.println(a +" is larger");
// }
// else{
//   System.out.println(b + "is larger");
// }

// System.out.print("Enter marks: ");
// int marks = sc.nextInt();
// if(marks>=90 && marks<=100){
//   System.out.println("Excellent");
// }
// else if(marks>=75 && marks<90){
//   System.out.println("Good");
// }
// else if(marks>=50 && marks<75){
//   System.out.println("Average");
// }
// else{
//   System.out.println("Fail");
// }
// System.out.print("Enter day: ");
// int day = sc.nextInt();
// if(day == 6 || day==7){
//   System.out.println("Weekend");
// }
// else{
//   System.out.println("Weekday");
// }
// System.out.print("Enter age: ");
// int age = sc.nextInt();
// if(age>=18 && age<=60){
//   System.out.println("Eligible");
// }
// else{
//   System.out.println("Not Eligible");
// }
System.out.print("Are you a student? ");
boolean student = sc.nextBoolean();
if(!student){
  System.out.println("Not a student");
}
else{
  System.out.println("Is a student");
}
    sc.close();
  }
}