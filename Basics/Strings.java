public class Strings {
  public static void main(String[] args) {
String a = "Hello";
String b = "hello";
String c = new String("Hello");


System.out.println(a.equals(b));
System.out.println(a.equalsIgnoreCase(b));
System.out.println(a==c);
  }
}

